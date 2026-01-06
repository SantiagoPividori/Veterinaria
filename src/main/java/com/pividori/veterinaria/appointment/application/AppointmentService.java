package com.pividori.veterinaria.appointment.application;

import com.pividori.veterinaria.appointment.infrastructure.in.dtos.AppointmentResponse;

import java.security.Principal;
import java.util.List;

public interface AppointmentService {

    public List<AppointmentResponse> getAppointments(Principal user);

}
