package com.example.myapplication;

import android.graphics.Bitmap;

public class Grass {
    private Bitmap bm;
    private int x, y, width, height;

    public Grass(int x, Bitmap bm, int y, int width, int height) {
        this.x = x;
        this.bm = bm;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
