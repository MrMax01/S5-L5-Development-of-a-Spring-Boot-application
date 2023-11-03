package massimomauro.S5L5DevelopmentofaSpringBootapplication.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private long Id;
    private String name;
    private String surname;
    private  String email;
    @OneToMany(mappedBy = "user")
    private List<Reservation> reservationList;
}
