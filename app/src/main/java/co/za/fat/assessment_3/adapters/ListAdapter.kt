package co.za.fat.assessment_3.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import co.za.fat.assessment_3.R
import co.za.fat.assessment_3.SearchFragment
import co.za.fat.assessment_3.model.Show

class ListAdapter(
    private val context: SearchFragment,
    private val dataset: List<Show>
) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    class ListViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.thumbprint)
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ListViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.image)
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    override fun getItemCount() = dataset.size

}