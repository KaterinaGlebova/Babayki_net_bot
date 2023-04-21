package ru.glebova.babayki_net_bot.entity;

import jakarta.persistence.*;

//Усыновитель, данные по нему вносит волонтер
@Entity
@Table (name = "pet_parent")
public class PetParent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "chat_id")
    private Long chatId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "number_of_report_days")
    private Integer numberOfReportDays;

    @ManyToOne
    @JoinColumn(name = "volunteer_id")
    private Volunteer volunteer;

    @OneToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    public PetParent() {
    }
}
