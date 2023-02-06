package com.example.learningandroid

import android.content.Context

class Datasource(val context: Context) {
    fun getFlowerList(): Array<String> {
        return context.resources.getStringArray(R.array.flower_array)
    }
}