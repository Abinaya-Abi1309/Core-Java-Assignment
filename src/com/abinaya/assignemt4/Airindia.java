package com.abinaya.assignemt4;

    // AirIndia class
class AirIndia implements Airfare {
    private Integer hours;
    private Double costPerHour;

    public AirIndia() {
    }

    public AirIndia(Integer hours, Double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(Double costPerHour) {
        this.costPerHour = costPerHour;
    }

    @Override
    public double calculateAmount() {
        return hours * costPerHour;
    }

    @Override
    public void display() {
        System.out.printf("%.2f\n", calculateAmount());
    }
}


