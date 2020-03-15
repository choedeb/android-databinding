package io.choedeb.android.example.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import io.choedeb.android.example.R
import io.choedeb.android.example.databinding.RowRecyclerBinding

class RecyclerAdapter(
    var items: List<SampleItem>,
    var viewModel: RecyclerViewModel
) : RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.row_recycler, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.binding.item = items[position]
        holder.binding.vm = viewModel
    }

    override fun getItemCount(): Int = items.size

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding: RowRecyclerBinding = DataBindingUtil.bind(itemView)!!
    }
}