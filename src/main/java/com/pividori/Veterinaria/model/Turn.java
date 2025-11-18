package com.pividori.Veterinaria.model;

import com.pividori.Veterinaria.model.utility.StateEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Turn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    private LocalDateTime dot;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
    @ManyToOne
    @JoinColumn(name = "veterinarian_id")
    private User veterinarian;
    private String reasonConsultation;
    @Enumerated(EnumType.STRING)
    private StateEnum stateTurn;

    public Turn(LocalDateTime dot, Pet pet, User veterinarian, String reasonConsultation) {
        this.dot = dot;
        this.pet = pet;
        this.veterinarian = veterinarian;
        this.reasonConsultation = reasonConsultation;
        this.stateTurn = StateEnum.RESERVED;
    }

    public Turn(LocalDateTime dot, Pet pet, User veterinarian, String reasonConsultation, StateEnum stateTurn) {
        this.dot = dot;
        this.pet = pet;
        this.veterinarian = veterinarian;
        this.reasonConsultation = reasonConsultation;
        this.stateTurn = stateTurn;
    }

}
