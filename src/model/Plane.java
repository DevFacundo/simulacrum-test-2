package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Plane {
    @JsonProperty("id")
    private int id;
    @JsonProperty("piloto")
    private String driverPlane;
    @JsonProperty("capacidad_pasajeros")
    private int passengerCapacity;

    public Plane() {
    }

    public Plane(int id, String driverPlane, int passengerCapacity) {
        this.id = id;
        this.driverPlane = driverPlane;
        this.passengerCapacity = passengerCapacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriverPlane() {
        return driverPlane;
    }

    public void setDriverPlane(String driverPlane) {
        this.driverPlane = driverPlane;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "model.Plane{" +
                "id=" + id +
                ", driverPlane='" + driverPlane + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }
}
