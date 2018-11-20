package com.thefuntasty.haulersample.draggable

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.thefuntasty.haulersample.R
import kotlinx.android.synthetic.main.activity_advanced_usage.*

class AdvancedUsageActivity : AppCompatActivity() {

    companion object {
        fun getStartIntent(context: Context): Intent = Intent(context, AdvancedUsageActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advanced_usage)

        advancedHaulerView.setOnDragDismissedListener {
            finish()
        }

        ignoredAreaView.setScrollViewParent(scrollViewParent)
    }
}
