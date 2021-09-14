package co.za.fat.assessment_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.RecyclerView
import co.za.fat.assessment_3.adapters.ItemAdapter
import co.za.fat.assessment_3.data.Datasource
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val myDataset = Datasource().loadShows()
//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//
//        recyclerView?.adapter = ItemAdapter(this, myDataset)
//        recyclerView?.setHasFixedSize(true)
        val navController = findNavController(R.id.nav_host_fragment)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav_view)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment,R.id.originals,R.id.libraryFragment, R.id.searchFragment))
        bottomNavigationView.setupWithNavController(navController)

        setupActionBarWithNavController(navController,appBarConfiguration)



    }
}