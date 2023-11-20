package thanhnguyen.assignment.appointmentmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import thanhnguyen.assignment.appointmentmanager.models.Customer;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    void deleteCustomerById(int id);

    Optional<Customer> findCustomerById(int id);

    Optional<Customer> findCustomersByNameContaining(String name);

    Optional<Customer> findCustomerByPhone(String phone);
}
