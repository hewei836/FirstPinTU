package com.example.h.game.utills;

import android.graphics.Bitmap;

/**
 * Created by H on 2016-03-28.
 */
public class ImagePiece {
    private int index;
    private Bitmap bitmap;
    public ImagePiece()
    {
    }
    public ImagePiece(int index,Bitmap bitmap){
        this.index=index;
        this.bitmap=bitmap;

    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "ImagePiece{" +
                "bitmap=" + bitmap +
                ", index=" + index +
                '}';
    }
}
