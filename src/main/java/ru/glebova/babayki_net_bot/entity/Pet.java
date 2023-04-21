package ru.glebova.babayki_net_bot.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "shelter_type")
    private boolean shelterType;

    @Column(name = "date_of_adoption")
    private LocalDate dateOfAdoption;

    public Pet() {
    }
}
