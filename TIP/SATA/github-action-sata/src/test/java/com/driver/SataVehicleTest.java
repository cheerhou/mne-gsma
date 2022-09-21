package com.driver;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @date: 2022/9/20
 * @author: hcj
 */
public class SataVehicleTest {
    SataVehicle sataVehicle;

    @Test
    public void go_increasesOdometerBy100AndDecreasesGallonsOfGasBy5WhenMilesPerGallonIs20() {
        givenVehicleHas0Odometer15GallonsOfGasAnd20MilesPerGallon();
        whenDrive100();
        thenOdometerIncreasesBy100AndGallonsOfGasDecreasesBy5();
    }

    private void givenVehicleHas0Odometer15GallonsOfGasAnd20MilesPerGallon() {
        sataVehicle = new SataVehicle();
        sataVehicle.setGallonsOfGas(15);
        sataVehicle.setOdometer(0);
        sataVehicle.setMilesPerGallon(20);
    }

    private void whenDrive100() {
        sataVehicle.go(100);
    }

    private void thenOdometerIncreasesBy100AndGallonsOfGasDecreasesBy5() {
        assertEquals(10, sataVehicle.getGallonsOfGas());
        assertEquals(100, sataVehicle.getOdometer());
    }

}