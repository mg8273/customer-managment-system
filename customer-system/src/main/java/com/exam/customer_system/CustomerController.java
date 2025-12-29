package com.exam.customer_system;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin("*") 
public class CustomerController {
    
    private final CustomerRepository repo;
    public CustomerController(CustomerRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Customer> getAll() { return repo.findAll(); }

    @PostMapping
    public Customer add(@RequestBody Customer c) { return repo.save(c); }

    @PutMapping("/{id}")
    public Customer update(@PathVariable Long id, @RequestBody Customer details) {
        Customer c = repo.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        c.setName(details.getName());
        c.setAddress(details.getAddress());
        return repo.save(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { repo.deleteById(id); }
}