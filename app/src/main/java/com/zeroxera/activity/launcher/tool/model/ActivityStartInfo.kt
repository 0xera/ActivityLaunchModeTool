package com.zeroxera.activity.launcher.tool.model

import com.zeroxera.activity.launcher.tool.presentation.activities.variants.A
import com.zeroxera.activity.launcher.tool.presentation.activities.variants.B
import com.zeroxera.activity.launcher.tool.presentation.activities.variants.C
import com.zeroxera.activity.launcher.tool.presentation.activities.variants.D

class ActivityStartInfo(
    val description: String,
    val classA: Class<out A>,
    val classB: Class<out B>,
    val classC: Class<out C>,
    val classD: Class<out D>,
)