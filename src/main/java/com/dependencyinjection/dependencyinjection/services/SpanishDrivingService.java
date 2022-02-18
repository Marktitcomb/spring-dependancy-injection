package com.dependencyinjection.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//becasue of this p[rofile only this will get picked oup with spring.profiles.active=ES in application properties
@Profile({"ES"})
@Service
public class SpanishDrivingService implements DrivingService{

    @Override
    public String getSpeedConfirmation() {
        return "kph";
    }

    @Override
    public String getVehicle() {
        return "Spanish Car";
    }
}
