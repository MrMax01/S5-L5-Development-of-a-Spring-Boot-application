package massimomauro.S5L5DevelopmentofaSpringBootapplication.entities;

import jakarta.persistence.*;
import massimomauro.S5L5DevelopmentofaSpringBootapplication.enums.StationType;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@Entity
@Table(name="stations")
public class Station {
    @Id
    @GeneratedValue
    private long id;
    private String description;
    private StationType staionType;
    private int maxNUmOccupant;

    @OneToOne
    @JoinColumn(name="building_id")
    private Building building;

    @OneToMany(mappedBy = "station")
    List<Reservation> reservationList;



    private boolean isFreeStationStatus;

    public Station() {
    }

    public Station(String description, StationType staionType, int maxNUmOccupant ,Building building) {
        this.description = description;
        this.staionType = staionType;
        this.maxNUmOccupant = maxNUmOccupant;
        this.building = building;
        this.isFreeStationStatus=true;
    }
}
