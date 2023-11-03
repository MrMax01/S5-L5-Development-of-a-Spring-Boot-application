package massimomauro.S5L5DevelopmentofaSpringBootapplication.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "buildings")
public class Building {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String street;
    private String city;

    @OneToOne(mappedBy = "building")
    private Station station;



    public Building() {
    }

    public Building(String name, String street, String city) {
        this.name = name;
        this.street = street;
        this.city = city;
    }
}
