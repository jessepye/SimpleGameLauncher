package com.jessepye.simplegamelauncher;

import android.graphics.drawable.Drawable;

public class AppInfo implements Comparable<AppInfo>{
    CharSequence label;
    CharSequence packageName;
    Drawable icon;

    @Override
    public int compareTo(AppInfo o) {
        /*
         * Sorting by label. compareTo should return < 0 if this(keyword)
         * is supposed to be less than o, > 0 if this is supposed to be
         * greater than object o and 0 if they are supposed to be equal.
         */

        return this.label.toString().compareTo(o.label.toString());
    }
}
