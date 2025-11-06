package com.pividori.Veterinaria.model;

import com.pividori.Veterinaria.model.utility.State;
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
    private Pet pet;
    private User veterinarian;
    private String reasonConsultation;
    @Enumerated(EnumType.STRING)
    private State state;

}
