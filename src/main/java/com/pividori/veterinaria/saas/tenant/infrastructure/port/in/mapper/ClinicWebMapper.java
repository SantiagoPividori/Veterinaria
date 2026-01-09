package com.pividori.veterinaria.saas.tenant.infrastructure.port.in.mapper;

import com.pividori.veterinaria.saas.tenant.application.port.in.RegisterClinicCommand;
import com.pividori.veterinaria.saas.tenant.application.port.in.RegisterClinicResult;
import com.pividori.veterinaria.saas.tenant.infrastructure.port.in.dto.RegisterClinicRequest;
import com.pividori.veterinaria.saas.tenant.infrastructure.port.in.dto.RegisterClinicResponse;

public final class ClinicWebMapper {

    private ClinicWebMapper() {
    }

    public static RegisterClinicCommand toRegisterClinicCommand(RegisterClinicRequest registerClinicRequest) {
        return new  RegisterClinicCommand(registerClinicRequest.name(), registerClinicRequest.timeZone());
    }

    public static RegisterClinicResponse toRegisterClinicResponse(RegisterClinicResult registerClinicResult) {
        return new RegisterClinicResponse(registerClinicResult.clinicId().value());
    }

}