package com.example.jenny.bitsandpizzas;

/**
 * Created by jenny on 10/23/2017.
 */

public class Pizza {
    private String name;
    private int imageResourceId;

    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Funghi", R.drawable.funghi),
            new Pizza("Murican", R.drawable.diavolo),
            new Pizza("National", R.drawable.funghi),
            new Pizza("Pepperone", R.drawable.diavolo),
    };

    private Pizza(String name, int imageResourceId) {
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