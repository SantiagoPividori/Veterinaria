package com.pividori.veterinaria.clinics.appointment.application;

import com.pividori.veterinaria.clinics.appointment.infrastructure.in.dtos.AppointmentResponse;

import java.security.Principal;
import java.util.List;

public interface AppointmentService {

    public List<AppointmentResponse> getAppointments(Principal user);

}
