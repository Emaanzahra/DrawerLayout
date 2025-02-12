package com.example.drawerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        val drawerlayout : DrawerLayout = findViewById(R.id.drawerlayout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerlayout, R.string.open, R.string.close)
        drawerlayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> Toast.makeText(applicationContext, "Click Home", Toast.LENGTH_SHORT).show()
                R.id.message -> Toast.makeText(applicationContext, "Click Home", Toast.LENGTH_SHORT).show()
                R.id.delete -> Toast.makeText(applicationContext, "Click Home", Toast.LENGTH_SHORT).show()
                R.id.privacy -> Toast.makeText(applicationContext, "Click Home", Toast.LENGTH_SHORT).show()
                R.id.setting -> Toast.makeText(applicationContext, "Click Home", Toast.LENGTH_SHORT).show()
                R.id.logout -> Toast.makeText(applicationContext, "Click Home", Toast.LENGTH_SHORT).show()
                R.id.share -> Toast.makeText(applicationContext, "Click Home", Toast.LENGTH_SHORT).show()
                R.id.rate -> Toast.makeText(applicationContext, "Click Home", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item))
        {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}