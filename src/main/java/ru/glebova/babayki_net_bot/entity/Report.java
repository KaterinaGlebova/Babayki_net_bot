package ru.glebova.babayki_net_bot.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


// Ежедневный отчет, заполняет усыновитель
@Entity
@Table (name = "report")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "report_date")
    private LocalDate reportDate;

    @OneToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @OneToOne
    @JoinColumn(name = "pet_parent_id")
    private PetParent petParent;

    @Column(name = "pet_diet")
    private String petDiet;

    @Column(name = "health")
    private String health;

    @Column(name = "changing habits")
    private String changingHabits;

    @OneToOne
    @JoinColumn(name = "photo_id")
    private Photo photo;

    @Column(name = "is_correct")
    private Boolean isCorrect;




    public Report() {
    }

}
