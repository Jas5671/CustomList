package com.example.customlist;

public class Item {
    private String Name, Date, Number, Time;
    private int image;

    public Item(String Name, String Date, String Number, String Time, int image) {
        this.Name = Name;
        this.Date = Date;
        this.image = image;
        this.Number = Number;
        this.Time = Time;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}