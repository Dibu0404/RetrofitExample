package com.example.retrofitexample

object ColorPicker{
    val colors = arrayOf("#ffcbcb","#70adb5","#ffcb8e","#28df99","#838383","#efbbcf","#e97171","#28df99","#2ec1ac","#d2e603")
    var colorIndex =  1
    fun getColor():String{
        return colors[colorIndex++ % colors.size]
    }
}
