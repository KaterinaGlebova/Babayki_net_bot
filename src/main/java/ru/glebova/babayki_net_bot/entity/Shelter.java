package ru.glebova.babayki_net_bot.entity;


import jakarta.persistence.*;

import java.util.List;


@Entity

public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "shelter_type")
    private boolean shelterType;

    @OneToMany
    @JoinColumn(name = "volunteer_id")
    private List <Volunteer> volunteers;

    @OneToMany
    @JoinColumn(name = "pet_id")
    private List <Pet> pets;




    public Shelter() {
    }
}