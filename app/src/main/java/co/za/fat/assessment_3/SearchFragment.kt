package co.za.fat.assessment_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import co.za.fat.assessment_3.adapters.ListAdapter
import co.za.fat.assessment_3.data.Datasource

class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myDataset = Datasource().loadShows()
        val recyclerView = view?.findViewById<RecyclerView>(R.id.lv_search_results)
        recyclerView?.adapter = ListAdapter(this, myDataset)
        recyclerView?.setHasFixedSize(true)

        //val searchView = view?.findViewById<RecyclerView>(R.id.searchView)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

}