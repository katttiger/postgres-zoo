package se.iths.cecilia.postrgreszoo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Lion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    private double weight;

    private int kills;

    public Lion() {
    }

    public Lion(String name, int age, double weight, int kills) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.kills = kills;
    }
}
