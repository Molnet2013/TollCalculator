package Vehicle;

import java.time.LocalDateTime;

public class Vehicle {
    protected LocalDateTime timeOfLastCameraFlash;
    protected int currentTotalFee;
    protected int lastFee;
    protected String regNr;
    private static int nrOfVehicles = 0;

    public Vehicle(String regNr) {
        this.currentTotalFee = 0;
        this.lastFee = 0;
        this.regNr = regNr;
        nrOfVehicles++;
    }

    public String getRegNr() {
        return this.regNr;
    }
    
    public static int getNrOfVehicles() {
        return nrOfVehicles;
    }
}
