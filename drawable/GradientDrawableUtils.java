package github.qishi604.com.player.util.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/**
 * @author seven
 * @version V1.0
 * @sice 2016/11/2
 */
public class GradientDrawableUtils {


    public static Drawable getDrawable(int color) {
        return getDrawable(color, 0xff000000);
    }

    public static Drawable getDrawable(int color, int bgColor) {
        GradientDrawable gd = new GradientDrawable();
        gd.setShape(GradientDrawable.OVAL);
        gd.setColor(bgColor);

        return gd;
    }


}
