package com.ginaf.safinance.ui.profile

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ginaf.safinance.R
import com.google.android.material.appbar.MaterialToolbar

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val toolbar = findViewById<MaterialToolbar>(R.id.customToolbar)

        toolbar.findViewById<LinearLayout>(R.id.homeToolbarContent).visibility = View.GONE
        toolbar.findViewById<LinearLayout>(R.id.otherToolbarContent).visibility = View.VISIBLE
        toolbar.findViewById<TextView>(R.id.tvTitle).text = getString(R.string.profile)

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back)
        toolbar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

    }

}