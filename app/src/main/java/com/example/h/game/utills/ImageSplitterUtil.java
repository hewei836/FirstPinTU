package com.example.h.game.utills;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H on 2016-03-28.
 */
public class ImageSplitterUtil {

    public static List<ImagePiece> splitImage(Bitmap bitmap, int piece)
    {
        List<ImagePiece> imagePieces = new ArrayList<ImagePiece>();

        int width = bitmap.getWidth();
        int height = bitmap.getHeight();

        int pieceWidth = Math.min(width, height) / piece;

        for (int i = 0; i < piece; i++)
        {
            for (int j = 0; j < piece; j++)
            {

                ImagePiece imagePiece = new ImagePiece();
                imagePiece.setIndex(j + i * piece);

                int x = j * pieceWidth;
                int y = i * pieceWidth;

                imagePiece.setBitmap(Bitmap.createBitmap(bitmap, x, y,
                        pieceWidth, pieceWidth));
                imagePieces.add(imagePiece);
            }
        }

        return imagePieces;
    }

}
