package thanhnguyen.assignment.appointmentmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanhnguyen.assignment.appointmentmanager.exception.CustomerNotFoundException;
import thanhnguyen.assignment.appointmentmanager.models.Customer;
import thanhnguyen.assignment.appointmentmanager.repo.CustomerRepo;

import java.util.List;
import java.util.UUID;

import static java.lang.Integer.parseInt;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }
    public Customer addCustomer(Customer customer){
        return customerRepo.save(customer);
    }
    public List<Customer> findAllCustomers(){
        return customerRepo.findAll();
    }
    public Customer updateCustomer(Customer customer){
        return customerRepo.save(customer);
    }
    public Customer findCustomerById(int id) {
        return customerRepo.findCustomerById(id).
                orElseThrow(() -> new CustomerNotFoundException("User by id " + id + " was not found"));
    }
    public Customer findCustomerByName(String name){
        return customerRepo.findCustomersByNameContaining(name).
                orElseThrow(()-> new CustomerNotFoundException("User by name " + name + " was not found"));
    }
    public Customer findCustomerByPhone(String phone){
        return customerRepo.findCustomerByPhone(phone)
                .orElseThrow(()-> new CustomerNotFoundException("User by phone " + phone + " was not found"));
    }
    public void deleteCustomer(int id){
        customerRepo.deleteCustomerById(id);
    }
}
