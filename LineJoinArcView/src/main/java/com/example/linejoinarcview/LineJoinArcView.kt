package com.example.linejoinarcview

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.RectF
import android.app.Activity
import android.content.Context

val colors : Array<Int> = arrayOf(
    "#F44336",
    "#2196F3",
    "#8BC34A",
    "#009688",
    "#FFC107"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 3
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val sizeFactor : Float = 2.9f
val rot : Float = 90f
val backColor : Int = Color.parseColor("#BDBDBD")
