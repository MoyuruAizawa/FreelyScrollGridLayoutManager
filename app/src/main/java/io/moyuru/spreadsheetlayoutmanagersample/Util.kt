package io.moyuru.spreadsheetlayoutmanagersample

import android.content.res.Resources

val Int.dp get() = (this * Resources.getSystem().displayMetrics.density).toInt()