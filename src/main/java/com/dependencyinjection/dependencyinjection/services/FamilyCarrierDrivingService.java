package com.dependencyinjection.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"EN"})
@Component
public class FamilyCarrierDrivingService implements DrivingService {


    @Override
    public String getSpeedConfirmation() {
        return "30";
    }

    @Override
    public String getVehicle() {
        return "Family Carrier";
    }
}
