package com.studyandroid.prac18;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class myPictureView extends View {


    public myPictureView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        Bitmap picture = BitmapFactory.decodeResource(getResources(),R.drawable.lena256);

        int picX = (this.getWidth()-picture.getWidth())/2;
        int picY = (this.getHeight()-picture.getHeight())/2;

        Paint paint = new Paint();
        float[] array ={2,0,0,0,-25,
                0,2,0,0,-25,
                0,0,2,0,-25,
                0,0,0,1,0};
        ColorMatrix cm = new ColorMatrix(array);
        paint.setColorFilter(new ColorMatrixColorFilter(cm));
        canvas.drawBitmap(picture,picX,picY,paint);
        picture.recycle();
    }
}
