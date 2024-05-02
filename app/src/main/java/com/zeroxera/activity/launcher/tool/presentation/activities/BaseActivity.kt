package com.zeroxera.activity.launcher.tool.presentation.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.core.app.ComponentActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.zeroxera.activity.launcher.tool.R
import com.zeroxera.activity.launcher.tool.presentation.App
import com.zeroxera.activity.launcher.tool.presentation.adapters.activity.ActivityStartAdapter
import com.zeroxera.activity.launcher.tool.presentation.adapters.flag.FlagsAdapter
import com.zeroxera.activity.launcher.tool.presentation.adapters.stack.StackAdapter
import com.zeroxera.activity.launcher.tool.provider.FlagProvider
import com.zeroxera.activity.launcher.tool.util.queryLaunchedFlags

abstract class BaseActivity : ComponentActivity() {

    val uniqueId = (0..Int.MAX_VALUE).random()
    private val flagsProvider = FlagProvider()
    private val activitiesProvider =
        com.zeroxera.activity.launcher.tool.provider.ActivitiesProvider()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAdapters()
    }

    private fun initAdapters() {
        initFlags()
        initActivities()
        initStacks()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        intent ?: return
        val queryLaunchedFlags = queryLaunchedFlags(intent)
        val flags = if (queryLaunchedFlags.isNotEmpty()) {
            "with flags:\n${queryLaunchedFlags.joinToString("\n")}"
        } else {
            ""
        }

        val message = "onNewIntent $flags"
        val snackbar =
            Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT)
        val textView =
            snackbar.view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
        textView.maxLines = queryLaunchedFlags.size + 1
        snackbar.show()
    }

    private fun initStacks() {
        val stackAdapter = StackAdapter()
        (application as App).taskStackProvider.stackInfo.observe(this) { newData ->
            stackAdapter.submitList(newData)
        }
        findViewById<RecyclerView>(R.id.stack_recycler_view).apply {
            layoutManager = LinearLayoutManager(this@BaseActivity)
            adapter = stackAdapter
        }
    }


    private fun initFlags() {
        val flagsAdapter = FlagsAdapter(
            flags = flagsProvider.flags,
            isSelected = { flagsProvider.isInSelected(it) },
            onSelected = { isChecked, flag ->
                if (isChecked) flagsProvider.setFlag(flag)
                else flagsProvider.removeFlag(flag)
            }
        )

        findViewById<RecyclerView>(R.id.flags_recycler_view).apply {
            layoutManager = GridLayoutManager(this@BaseActivity, 2)
            adapter = flagsAdapter
        }
    }

    private fun initActivities() {
        val activityStartAdapter = ActivityStartAdapter(
            activities = activitiesProvider.activities,
            onStart = { clazz ->
                var flagCodes = 0
                flagsProvider.selectedFlags.forEach { flag ->
                    flagCodes = flagCodes or flag.code
                }
                startActivity(
                    Intent(this, clazz)
                        .addFlags(flagCodes)
                )
            }
        )

        findViewById<RecyclerView>(R.id.activities_recycler_view).apply {
            layoutManager = LinearLayoutManager(this@BaseActivity)
            adapter = activityStartAdapter
        }
    }
}