package kz.krpt.boxproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import kz.krpt.boxproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  navController: NavController
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        setSupportActionBar(binding.toolbar)
        //val appBar = AppBarConfiguration(setOf(R.id.topFragment), drawer_layout)
        //toolbar.setupWithNavController(navController, appBar)
        navController = navHostFragment.navController
    }
}