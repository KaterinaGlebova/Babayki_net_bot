package ru.glebova.babayki_net_bot.entity;

import jakarta.persistence.*;

//Хранение фотографий
@Entity
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "file_id")
    private String fileId;


    public Photo(String fileId) {
        this.fileId = fileId;
    }

    public Photo() {
    }
}
