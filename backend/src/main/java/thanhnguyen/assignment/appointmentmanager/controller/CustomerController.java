package thanhnguyen.assignment.appointmentmanager.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thanhnguyen.assignment.appointmentmanager.models.Customer;
import thanhnguyen.assignment.appointmentmanager.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> customers = customerService.findAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
    @GetMapping("/find/{phone}")
    public ResponseEntity<Customer> getCustomerByPhone(@PathVariable("phone") String phone){
        Customer customer = customerService.findCustomerByPhone(phone);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    @GetMapping("/find/{name}")
    public ResponseEntity<Customer> getCustomerByName(@PathVariable("name") String name){
        Customer customer = customerService.findCustomerByName(name);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id){
        Customer customer = customerService.findCustomerById(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        Customer newCustomer = customerService.addCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
        Customer updateCustomer = customerService.updateCustomer(customer);
        return new ResponseEntity<>(updateCustomer, HttpStatus.OK);
    }
}
