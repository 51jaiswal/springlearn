package com.jaiswal.todo.api;
import com.jaiswal.todo.model.Customer;
import com.jaiswal.todo.service.CustomerService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/customers")
public class CustomerResource {
    @Autowired
    private CustomerService customerService;
    @PostMapping
    public Customer addCustomer (@RequestBody Customer customer){
        return customerService.addCustomer(customer);

    }
}
