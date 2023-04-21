package ru.glebova.babayki_net_bot.entity;

import jakarta.persistence.*;


@Entity
@Table( name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "chat_id")
    private Long chatId;




    public User() {
    }
}
