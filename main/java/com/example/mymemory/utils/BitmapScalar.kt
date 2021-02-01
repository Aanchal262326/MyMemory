package com.example.mymemory.utils

import android.graphics.Bitmap

object BitmapScalar {
//Scale and maintain aspect ratio given a desired width
    //BitmapScalar.scaleToFitWidth(bitmap,100);
    fun scaleToFitWidth(b:Bitmap,width:Int):Bitmap{
        val factor:Float=width/b.width.toFloat()
    return Bitmap.createScaledBitmap(b,width,(b.height*factor).toInt(),true)
    }
    //Scale and maintain aspect ratio given a desired height
    fun scaleToFitHeight(b:Bitmap,height:Int):Bitmap{
        val factor=height/b.height.toFloat()
        return Bitmap.createScaledBitmap(b,(b.width*factor).toInt(),height,true)
    }
}
