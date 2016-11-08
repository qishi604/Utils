package github.qishi604.com.player.util.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;

/**
 * @author seven
 * @version V1.0
 * @sice 2016/11/2
 */
public class GradientDrawableBuilder {

    private GradientDrawable drawable;

    public GradientDrawableBuilder() {
        drawable = new GradientDrawable();
    }

    /**
     * @see GradientDrawable#setColor(int)
     * @param argb color
     * @return GradientDrawableBuilder
     */
    public GradientDrawableBuilder setColor(@ColorInt int argb) {
        drawable.setColor(argb);
        return this;
    }

    /**
     * @see GradientDrawable#setStroke(int, int)
     * @param width Stroke width
     * @param argb stroke color
     * @return GradientDrawableBuilder
     */
    public GradientDrawableBuilder setStroke(int width, @ColorInt int argb) {
        drawable.setStroke(width, argb);
        return this;
    }

    /**
     * @see GradientDrawable#setShape(int)
     * @param shape One of {@link GradientDrawable#OVAL}
     * @return GradientDrawableBuilder
     */
    public GradientDrawableBuilder setShape(int shape) {
        drawable.setShape(shape);
        return this;
    }

    public Drawable build() {
        return drawable;
    }
}
