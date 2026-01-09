package com.pividori.veterinaria.saas.tenant.infrastructure.persistence;

import com.pividori.veterinaria.saas.tenant.domain.ClinicStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Table(name = "clinics")
public class ClinicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private ClinicStatus status;
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

}
