package com.mycompany.qantamradar;

import java.util.*;

public class Observation {
    private String plateNumber;
    private String date;
    private CarType carType;
    private int speed;
    private SeatbeltStatus seatbeltStatus;

    public Observation() {

    }

    public Observation(String plateNumber, String date, CarType carType, int speed, SeatbeltStatus seatbeltStatus) {
        this.plateNumber = plateNumber;
        this.date = date;
        this.carType = carType;
        this.speed = speed;
        this.seatbeltStatus = seatbeltStatus;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public SeatbeltStatus getSeatbeltStatus() {
        return seatbeltStatus;
    }

    public void setSeatbeltStatus(SeatbeltStatus seatbeltStatus) {
        this.seatbeltStatus = seatbeltStatus;
    }

    @Override
    public String toString() {
        return "Observation{" +
                "plateNumber='" + plateNumber + '\'' +
                ", date='" + date + '\'' +
                ", carType=" + carType +
                ", speed=" + speed +
                ", seatbeltStatus=" + seatbeltStatus +
                '}';
    }
}
