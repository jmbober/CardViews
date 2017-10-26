package com.example.jenny.bitsandpizzas;

/**
 * Created by jenny on 10/25/2017.
 */

public class Stores {
    private String name;
    private int imageResourceId;

    public static final Stores[] stores = {
            new Stores("Cambridge", R.drawable.store1),
            new Stores("Sebastopol", R.drawable.store2),
    };

    private Stores(String name, int imageResourceId) {
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
