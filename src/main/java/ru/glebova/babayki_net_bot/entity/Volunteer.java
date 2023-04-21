package ru.glebova.babayki_net_bot.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "volunteer")

public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "chat_id")
    private Long chatId;

    @Column(name = "full_name")
    private String fullName;

    @OneToOne
    @Column(name = "shelter_type")
    private Shelter shelterType;



    public Volunteer() {
    }
}
