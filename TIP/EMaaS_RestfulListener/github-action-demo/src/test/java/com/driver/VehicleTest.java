package com.driver;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @date: 2022/9/20
 * @author: hcj
 */
public class VehicleTest {
    Vehicle vehicle;

    @Test
    public void go_increasesOdometerBy100AndDecreasesGallonsOfGasBy5WhenMilesPerGallonIs20() {
        givenVehicleHas0Odometer15GallonsOfGasAnd20MilesPerGallon();
        whenDrive100();
        thenOdometerIncreasesBy100AndGallonsOfGasDecreasesBy5();
    }

    private void givenVehicleHas0Odometer15GallonsOfGasAnd20MilesPerGallon() {
        vehicle = new Vehicle();
        vehicle.setGallonsOfGas(15);
        vehicle.setOdometer(0);
        vehicle.setMilesPerGallon(20);
    }

    private void whenDrive100() {
        vehicle.go(100);
    }

    private void thenOdometerIncreasesBy100AndGallonsOfGasDecreasesBy5() {
        assertEquals(10, vehicle.getGallonsOfGas());
        assertEquals(100, vehicle.getOdometer());
    }

}