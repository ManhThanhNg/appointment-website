package thanhnguyen.assignment.appointmentmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import thanhnguyen.assignment.appointmentmanager.models.Playground;

public interface PlaygroundRepo extends JpaRepository<Playground, Integer> {
}
