package com.dependencyinjection.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"EN"})
@Component
public class SuperCarDrivingService implements DrivingService{

    @Override
    public String getSpeedConfirmation(){
        return "300";
    }

    @Override
    public String getVehicle(){
        return "Super car";
    }
}
