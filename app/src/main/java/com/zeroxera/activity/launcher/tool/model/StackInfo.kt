package com.zeroxera.activity.launcher.tool.model

sealed interface StackInfo {
    data class TaskInfo(
        val taskId: Int,
        val isSelected: Boolean,
        val taskAffinity: String
    ) : StackInfo

    data class ActivityInfo(
        val hash: Int,
        val name: String,
        val isSelected: Boolean,
        val launchedFlags: String
    ) : StackInfo
}