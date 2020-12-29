package ru.netology.domain;

public class GeoLocation {

    private int type;  // тип места;
    private int coordinates;  //  координаты места;
    private int place;  // описание места (если оно добавлено);

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace( int place) {
        this.place = place;
    }
}
