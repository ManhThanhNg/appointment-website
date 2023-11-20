package thanhnguyen.assignment.appointmentmanager.models;

import jakarta.persistence.*;

@Entity
public class Playground {
    @Id
    @Column(nullable = false)
    @SequenceGenerator(
            name = "playground_sequence",
            sequenceName = "playground_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "playground_sequence"
    )
    private int id;
    private String name;
    private Long price;

    public Playground(int id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Playground() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}

