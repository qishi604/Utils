package github.qishi604.com.player.util.drawable;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;

/**
 * @author seven
 * @version V1.0
 * @sice 2016/11/2
 */
@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class RippleDrawableUtils {


    public static Drawable getDrawable(int rippleColor) {
        return getDrawable(rippleColor, 0xff000000);
    }

    public static Drawable getDrawable(int rippleColor, int bgColor) {
        return getDrawable(rippleColor, bgColor, GradientDrawable.OVAL);
    }

    /**
     *
     * @param rippleColor
     * @param bgColor
     * @param shape
     * @return
     */
    public static Drawable getDrawable(int rippleColor, int bgColor, int shape) {
        ColorStateList list = ColorStateList.valueOf(rippleColor);
        GradientDrawable gd = new GradientDrawable();
        gd.setShape(shape);
        gd.setColor(bgColor);
        RippleDrawable rippleDrawable = new RippleDrawable(list, gd, null);
        return rippleDrawable;
    }

}
