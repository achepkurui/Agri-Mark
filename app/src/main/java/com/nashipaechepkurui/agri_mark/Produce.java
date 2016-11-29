package com.nashipaechepkurui.agri_mark;

/**
 * Created by Student on 11/24/2016.
 */
public class Produce {
    private String name;
    private int amountOfProduce;
    private int thumbnail;

    public Produce() {
    }

    public Produce(String name, int amountOfProduce, int thumbnail) {
        this.name = name;
        this.amountOfProduce = amountOfProduce;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfProduce() {
        return amountOfProduce;
    }

    public void setAmountOfProduce(int numOfSongs) {
        this.amountOfProduce = amountOfProduce;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

}
