package thanhnguyen.assignment.appointmentmanager.models;

import jakarta.persistence.*;

@Entity
public class Appointments {
    @Id
    @SequenceGenerator(
            name = "appointments_sequence",
            sequenceName = "appointments_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "appointments_sequence"
    )
    private Long id; // Assuming you want a primary key for Appointments
    @ManyToOne
    @JoinColumn(name = "playground_id")
    private Playground playgroundId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;
    private int checkinTime;
    private int checkoutTime;
    private String date;
    private boolean isCustomerCheckedIn;
    private boolean isCustomerCheckedOut;

    public Appointments(Playground playgroundId, Customer customerId, int checkinTime, int checkoutTime, String date) {
        this.playgroundId = playgroundId;
        this.customerId = customerId;
        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
        this.date = date;
        this.isCustomerCheckedIn = false;
        this.isCustomerCheckedOut = false;
    }
    public Appointments() {
        this.isCustomerCheckedIn = false;
        this.isCustomerCheckedOut = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Playground getPlaygroundId() {
        return playgroundId;
    }

    public void setPlaygroundId(Playground playgroundId) {
        this.playgroundId = playgroundId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public int getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(int checkinTime) {
        this.checkinTime = checkinTime;
    }

    public int getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(int checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public boolean isCustomerCheckedOut() {
        return isCustomerCheckedOut;
    }

    public void setCustomerCheckedOut(boolean customerCheckedOut) {
        isCustomerCheckedOut = customerCheckedOut;
    }

    public boolean isCustomerCheckedIn() {
        return isCustomerCheckedIn;
    }

    public void setCustomerCheckedIn(boolean customerCheckedIn) {
        isCustomerCheckedIn = customerCheckedIn;
    }
    public String toString() {
        return "Appointments{" +
                "id=" + id +
                ", playgroundId='" + playgroundId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", checkinTime='" + checkinTime + '\'' +
                ", checkoutTime='" + checkoutTime + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
