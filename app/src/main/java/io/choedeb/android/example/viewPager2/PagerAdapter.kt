package io.choedeb.android.example.viewPager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import io.choedeb.android.example.R
import io.choedeb.android.example.databinding.RowPagerBinding

class PagerAdapter(
    var items: List<PagerItem>,
    var viewModel: PagerViewModel
) : RecyclerView.Adapter<PagerAdapter.TutorialViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TutorialViewHolder {
        return TutorialViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.row_pager, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TutorialViewHolder, position: Int) {
        holder.binding.item = items[position]
        holder.binding.vm = viewModel
    }

    override fun getItemCount(): Int = items.size

    class TutorialViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding: RowPagerBinding = DataBindingUtil.bind(itemView)!!
    }
}