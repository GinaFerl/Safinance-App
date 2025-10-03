package com.ginaf.safinance.ui.settings

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.ginaf.safinance.R
import com.ginaf.safinance.ui.profile.ProfileActivity

class SettingsPreferenceFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)

        val profile = findPreference<Preference>(getString(R.string.pref_key_profile))
        profile?.setOnPreferenceClickListener {
            val intent = Intent(requireContext(), ProfileActivity::class.java)
            startActivity(intent)
            true
        }

        val theme = findPreference<ListPreference>(getString(R.string.pref_key_dark))
        theme?.setOnPreferenceChangeListener { _, newValue ->
            val themeMode = when (newValue) {
                getString(R.string.pref_dark_follow_system) -> AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
                getString(R.string.pref_dark_on) -> AppCompatDelegate.MODE_NIGHT_YES
                getString(R.string.pref_dark_off) -> AppCompatDelegate.MODE_NIGHT_NO
                else -> AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
            }
            updateTheme(themeMode)
            true
        }
    }

    private fun updateTheme(themeMode: Int): Boolean {
        AppCompatDelegate.setDefaultNightMode(themeMode)
        requireActivity().recreate()
        return true
    }
}
