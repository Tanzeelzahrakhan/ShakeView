package app.itwingtech.shakelibrary

import android.animation.ObjectAnimator
import android.view.View
import android.view.animation.CycleInterpolator

object ShakeLibraryView {

    fun View.shake(duration: Long = 9000, shakeDistance: Float = 50f) {
        val shakeAnimator = ObjectAnimator.ofFloat(this, "translationX", 4f, shakeDistance)
        shakeAnimator.duration = duration
        shakeAnimator.interpolator = CycleInterpolator(20f)
        shakeAnimator.start()
        }


}