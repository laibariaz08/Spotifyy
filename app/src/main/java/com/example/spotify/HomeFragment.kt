package com.example.spotify

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import android.widget.Button
import androidx.core.view.GravityCompat

class HomeFragment : Fragment() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.home_page, container, false)

        // Initialize drawerLayout and navView
        drawerLayout = view.findViewById(R.id.drawer_layout)
        navView = view.findViewById(R.id.nav_view)

        // Set up the circle button to open the drawer
        val circleButton: Button = view.findViewById(R.id.button_circle)
        circleButton.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        // Set up navigation item selection listener
        navView.setNavigationItemSelectedListener { menuItem ->
            handleNavigationItemSelected(menuItem)
            true
        }

        return view
    }

    private fun handleNavigationItemSelected(menuItem: MenuItem) {
        when (menuItem.itemId) {
            R.id.nav_item1 -> {
                val intent = Intent(requireContext(), AddAccountActivity::class.java)
                startActivity(intent)
            }
            R.id.nav_item2 -> {
                val intent = Intent(requireContext(), WhatsNewActivity::class.java)
                startActivity(intent)
            }
            R.id.nav_item3 -> {
                val intent = Intent(requireContext(), ListeningHistoryActivity::class.java)
                startActivity(intent)
            }
            R.id.nav_item4 -> {
                // Open SettingsAndPrivacyActivity
                val intent = Intent(requireContext(), SettingsAndPrivacyActivity::class.java)
                startActivity(intent)
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
    }
}
