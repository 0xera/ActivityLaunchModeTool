package com.zeroxera.activity.launcher.tool.util

import android.content.Intent
import com.zeroxera.activity.launcher.tool.provider.FlagProvider.Companion.ALL_FLAGS

fun queryLaunchedFlags(intent: Intent): List<String> {
    val flags = mutableListOf<String>()
    for (flag in ALL_FLAGS) {
        val flagValue: Int = flag.value
        if (intent.flags and flagValue != 0) {
            flags += flag.name
        }
    }
    return flags

}