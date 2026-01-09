package com.pividori.veterinaria.saas.tenant.domain.model;

import com.pividori.veterinaria.saas.tenant.domain.ClinicId;
import com.pividori.veterinaria.saas.tenant.domain.ClinicStatus;

import java.time.Instant;

public class Clinic {

    private final ClinicId id;
    private final String name;
    private final ClinicStatus status;
    private final Instant createdAt;

    public Clinic(ClinicId id, String name, ClinicStatus status, Instant createdAt) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Clinic(String name, ClinicStatus status, Instant createdAt) {
        this.id = null;
        this.name = name;
        this.status = status;
        this.createdAt = createdAt;
    }

    public ClinicId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ClinicStatus getStatus() {
        return status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public static Clinic register(String name, Instant createdAt) {
        return new Clinic(name, ClinicStatus.ACTIVE, createdAt);
    }

    public Clinic suspend() {
        if (this.status == ClinicStatus.SUSPENDED) {
            return this;
        }
        return new Clinic(this.id, this.name, ClinicStatus.SUSPENDED, this.createdAt);
    }

    public Clinic activate() {
        if (this.status == ClinicStatus.ACTIVE) {
            return this;
        }
        return new Clinic(this.id, this.name, ClinicStatus.ACTIVE, this.createdAt);
    }

}
