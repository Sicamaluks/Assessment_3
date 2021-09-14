package co.za.fat.assessment_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import co.za.fat.assessment_3.adapters.ItemAdapter
import co.za.fat.assessment_3.data.Datasource

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val myDataset = Datasource().loadShows()
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView?.adapter = ItemAdapter(this, myDataset)
        recyclerView?.setHasFixedSize(true)


        // Inflate the layout for this fragment
        return view
    }
}