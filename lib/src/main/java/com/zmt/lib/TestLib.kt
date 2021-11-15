package com.zmt.lib

import android.content.Context
import android.widget.Toast

/**
 * Description:
 * Author: ricky
 * CreateDate: 2021/11/15 10:10 上午
 */
object TestLib {
    fun toast(context: Context) {
        Toast.makeText(context, "1111111", Toast.LENGTH_LONG).show()
    }
}