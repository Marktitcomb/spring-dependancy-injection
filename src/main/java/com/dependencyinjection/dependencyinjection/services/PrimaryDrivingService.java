package com.dependencyinjection.dependencyinjection.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Primary
@Profile({"EN", "default"})
@Service
public class PrimaryDrivingService implements DrivingService{
    @Override
    public String getSpeedConfirmation() {
        return "this is the primary speed";
    }

    @Override
    public String getVehicle() {
        return "This is the primary vehicle";
    }
}
