package com.zeroxera.activity.launcher.tool.provider

import com.zeroxera.activity.launcher.tool.model.ActivityStartInfo
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.SingleInstanceA
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.SingleInstanceB
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.SingleInstanceC
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.SingleInstanceD
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.affinity.SingleInstanceAffinityA
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.affinity.SingleInstanceAffinityB
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.affinity.SingleInstanceAffinityC
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.affinity.SingleInstanceAffinityD
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.pertask.SingleInstancePerTaskA
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.pertask.SingleInstancePerTaskB
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.pertask.SingleInstancePerTaskC
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.pertask.SingleInstancePerTaskD
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.pertask.affinity.SingleInstancePerTaskAffinityA
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.pertask.affinity.SingleInstancePerTaskAffinityB
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.pertask.affinity.SingleInstancePerTaskAffinityC
import com.zeroxera.activity.launcher.tool.presentation.activities.single.instance.pertask.affinity.SingleInstancePerTaskAffinityD
import com.zeroxera.activity.launcher.tool.presentation.activities.single.task.SingleTaskA
import com.zeroxera.activity.launcher.tool.presentation.activities.single.task.SingleTaskB
import com.zeroxera.activity.launcher.tool.presentation.activities.single.task.SingleTaskC
import com.zeroxera.activity.launcher.tool.presentation.activities.single.task.SingleTaskD
import com.zeroxera.activity.launcher.tool.presentation.activities.single.task.affinity.SingleTaskAffinityA
import com.zeroxera.activity.launcher.tool.presentation.activities.single.task.affinity.SingleTaskAffinityB
import com.zeroxera.activity.launcher.tool.presentation.activities.single.task.affinity.SingleTaskAffinityC
import com.zeroxera.activity.launcher.tool.presentation.activities.single.task.affinity.SingleTaskAffinityD
import com.zeroxera.activity.launcher.tool.presentation.activities.single.top.SingleTopA
import com.zeroxera.activity.launcher.tool.presentation.activities.single.top.SingleTopB
import com.zeroxera.activity.launcher.tool.presentation.activities.single.top.SingleTopC
import com.zeroxera.activity.launcher.tool.presentation.activities.single.top.SingleTopD
import com.zeroxera.activity.launcher.tool.presentation.activities.single.top.affinity.SingleTopAffinityA
import com.zeroxera.activity.launcher.tool.presentation.activities.single.top.affinity.SingleTopAffinityB
import com.zeroxera.activity.launcher.tool.presentation.activities.single.top.affinity.SingleTopAffinityC
import com.zeroxera.activity.launcher.tool.presentation.activities.single.top.affinity.SingleTopAffinityD
import com.zeroxera.activity.launcher.tool.presentation.activities.standard.StandardA
import com.zeroxera.activity.launcher.tool.presentation.activities.standard.StandardB
import com.zeroxera.activity.launcher.tool.presentation.activities.standard.StandardC
import com.zeroxera.activity.launcher.tool.presentation.activities.standard.StandardD
import com.zeroxera.activity.launcher.tool.presentation.activities.standard.affinity.StandardAffinityA
import com.zeroxera.activity.launcher.tool.presentation.activities.standard.affinity.StandardAffinityB
import com.zeroxera.activity.launcher.tool.presentation.activities.standard.affinity.StandardAffinityC
import com.zeroxera.activity.launcher.tool.presentation.activities.standard.affinity.StandardAffinityD

class ActivitiesProvider {

    val activities = listOf(
        ActivityStartInfo(
            "StandardActivity",
            StandardA::class.java,
            StandardB::class.java,
            StandardC::class.java,
            StandardD::class.java
        ),
        ActivityStartInfo(
            "StandardActivity with custom affinity",
            StandardAffinityA::class.java,
            StandardAffinityB::class.java,
            StandardAffinityC::class.java,
            StandardAffinityD::class.java
        ),
        ActivityStartInfo(
            "SingleTopActivity",
            SingleTopA::class.java,
            SingleTopB::class.java,
            SingleTopC::class.java,
            SingleTopD::class.java
        ),

        ActivityStartInfo(
            "SingleTopActivity with custom affinity",
            SingleTopAffinityA::class.java,
            SingleTopAffinityB::class.java,
            SingleTopAffinityC::class.java,
            SingleTopAffinityD::class.java
        ),


        ActivityStartInfo(
            "SingleTaskActivity",
            SingleTaskA::class.java,
            SingleTaskB::class.java,
            SingleTaskC::class.java,
            SingleTaskD::class.java
        ),

        ActivityStartInfo(
            "SingleTaskActivity with custom affinity",
            SingleTaskAffinityA::class.java,
            SingleTaskAffinityB::class.java,
            SingleTaskAffinityC::class.java,
            SingleTaskAffinityD::class.java
        ),

        ActivityStartInfo(
            "SingleInstanceActivity",
            SingleInstanceA::class.java,
            SingleInstanceB::class.java,
            SingleInstanceC::class.java,
            SingleInstanceD::class.java
        ),

        ActivityStartInfo(
            "SingleInstanceActivity with custom affinity",
            SingleInstanceAffinityA::class.java,
            SingleInstanceAffinityB::class.java,
            SingleInstanceAffinityC::class.java,
            SingleInstanceAffinityD::class.java
        ),

        ActivityStartInfo(
            "SingleInstancePerTaskActivity",
            SingleInstancePerTaskA::class.java,
            SingleInstancePerTaskB::class.java,
            SingleInstancePerTaskC::class.java,
            SingleInstancePerTaskD::class.java
        ),

        ActivityStartInfo(
            "SingleInstancePerTaskActivity with custom affinity",
            SingleInstancePerTaskAffinityA::class.java,
            SingleInstancePerTaskAffinityB::class.java,
            SingleInstancePerTaskAffinityC::class.java,
            SingleInstancePerTaskAffinityD::class.java
        ),

        )
}

