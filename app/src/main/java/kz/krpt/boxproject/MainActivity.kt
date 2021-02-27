package kz.krpt.boxproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kz.krpt.boxproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var currentPosition: Int = 0
    private lateinit var  navController: NavController
    private lateinit var appBar: AppBarConfiguration
    private lateinit var titles: Array<String>
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        setSupportActionBar(binding.toolbar)
        navController = navHostFragment.navController
        val appBar = AppBarConfiguration(setOf(R.id.topFragment), drawer_layout)
        toolbar.setupWithNavController(navController, appBar)
        drawerMenu(binding.drawerNavigation)
    }
    private fun drawerMenu(navigation: NavigationView){
        navigation.setNavigationItemSelectedListener {p0 ->
            when(p0.itemId){
                R.id.main_item ->{
                    currentPosition = 0
                    if(navController.currentDestination!!.id != R.id.topFragment){
                        navController.navigate(R.id.topFragment)
                    }
                }

            }
            drawer_layout.closeDrawer(GravityCompat.START)
            true
        }
    }

}