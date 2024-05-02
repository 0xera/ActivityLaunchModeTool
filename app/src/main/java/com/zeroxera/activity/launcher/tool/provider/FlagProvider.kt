package com.zeroxera.activity.launcher.tool.provider

import android.content.Intent;
import com.zeroxera.activity.launcher.tool.model.Flag

class FlagProvider {

    private val _selectedFlags = mutableSetOf<Flag>()
    val selectedFlags: Set<Flag>
        get() = _selectedFlags.toSet()

    fun setFlag(flag: Flag) {
        _selectedFlags += flag
    }

    fun removeFlag(flag: Flag) {
        _selectedFlags -= flag
    }

    fun isInSelected(flag: Flag) = _selectedFlags.contains(flag)

    companion object {
        val ALL_FLAGS = Intent::class.java.declaredFields
            .asSequence()
            .filter { it.name.startsWith("FLAG_ACTIVITY") }
            .mapNotNull {
                runCatching {
                    it.isAccessible = true
                    Flag(it.name.removePrefix("FLAG_ACTIVITY_"), it.getInt(null))
                }.getOrNull()
            }.toList()
    }
}


