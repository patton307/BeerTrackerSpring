package com.theironyard.entities;

import com.theironyard.entities.Beer;

import javax.persistence.*;
import java.util.List;

/**
 * Created by landonkail on 11/11/15.
 */
@Entity
@Table(name ="users")
public class User {
    @Id
    @GeneratedValue
    Integer id;

    public String name;
    public String password;

    @OneToMany(mappedBy = "user") // the name of the field in the Beer class
    public List<Beer> beers;
}
