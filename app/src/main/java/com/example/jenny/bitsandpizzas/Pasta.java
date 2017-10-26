package com.example.jenny.bitsandpizzas;

/**
 * Created by jenny on 10/25/2017.
 */

public class Pasta {
    private String name;
    private int imageResourceId;

    public static final Pasta[] pastas = {
            new Pasta("Spaghetti Bolognese", R.drawable.spaghetti),//change pics
            new Pasta("Fettuchine Alfrado", R.drawable.fettuccine),
    };

    private Pasta(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
