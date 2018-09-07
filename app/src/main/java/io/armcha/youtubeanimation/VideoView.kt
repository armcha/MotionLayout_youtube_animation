package io.armcha.youtubeanimation

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatImageView


/**
 *
 * Created by Arman Chatikyan on 05 Sep 2018
 *
 */

class VideoView(context: Context, attributeSet: AttributeSet? = null) : AppCompatImageView(context, attributeSet) {

    var imageWidth = 0
        set(value) {
            Log.e("imageWidth ", "value $value")
            val params = layoutParams as FrameLayout.LayoutParams
            params.height = value
            layoutParams = params
            invalidate()
        }
}