package com.ginaf.safinance.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.ginaf.safinance.R
import com.google.android.material.appbar.MaterialToolbar

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        if (savedInstanceState == null) {
            childFragmentManager.beginTransaction()
                .replace(R.id.settings_container, SettingsPreferenceFragment())
                .commit()
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toolbar = view.findViewById<MaterialToolbar>(R.id.customToolbar)
        toolbar.findViewById<LinearLayout>(R.id.homeToolbarContent).visibility = View.GONE
        toolbar.findViewById<LinearLayout>(R.id.otherToolbarContent).visibility = View.VISIBLE
        toolbar.findViewById<TextView>(R.id.tvTitle).text = getString(R.string.title_settings)

    }
}
