package com.pividori.veterinaria.appointment.application;

import com.pividori.veterinaria.appointment.infrastructure.in.dtos.AppointmentResponse;
import com.pividori.veterinaria.appointment.infrastructure.out.AppointmentRepository;
import com.pividori.veterinaria.user.application.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

@RequiredArgsConstructor
@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final UserService userService;
    private final AppointmentRepository appointmentRepository;

    @Override
    public List<AppointmentResponse> getAppointments(Principal user) {
        userService.findByUsername(user.getName());
        return List.of();
    }
}
