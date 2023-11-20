package thanhnguyen.assignment.appointmentmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import thanhnguyen.assignment.appointmentmanager.models.Appointments;

public interface AppointmentsRepo extends JpaRepository<Appointments, Integer> {
}
