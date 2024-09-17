package app.itwingtech.shakelibrary;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.CycleInterpolator;

public class ShakeLib {

    public static void shake(View view, long duration, float shakeDistance) {
        ObjectAnimator shakeAnimator = ObjectAnimator.ofFloat(view, "translationY", 4f, shakeDistance);
        shakeAnimator.setDuration(duration);
        shakeAnimator.setInterpolator(new CycleInterpolator(20f));
        shakeAnimator.start();
}
}
