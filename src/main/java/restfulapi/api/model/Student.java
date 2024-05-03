package restfulapi.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "student")
@Getter @Setter
public class Student {
    @Id
    @Column(name = "id")
    private  Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "year")
    private String year;
}
