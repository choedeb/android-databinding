package io.choedeb.android.example

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import io.choedeb.android.example.recyclerView.RecyclerAdapter
import io.choedeb.android.example.recyclerView.RecyclerViewModel
import io.choedeb.android.example.recyclerView.SampleItem
import io.choedeb.android.example.viewPager2.PagerAdapter
import io.choedeb.android.example.viewPager2.PagerViewModel
import io.choedeb.android.example.viewPager2.PagerItem

object BindingAdapterUtil {

    @JvmStatic
    @BindingAdapter(value = ["items", "viewModel"])
    fun setRecyclerItems(view: RecyclerView, items: List<SampleItem>, viewModel: RecyclerViewModel) {
        view.adapter?.run {
            if (this is RecyclerAdapter) {
                this.items = items
                this.viewModel = viewModel
                this.notifyDataSetChanged()
            }
        } ?: kotlin.run {
            RecyclerAdapter(items, viewModel).apply {
                view.adapter = this
            }
        }
    }

    @JvmStatic
    @BindingAdapter(value = ["items", "viewModel"])
    fun setPagerItems(
        viewPager: ViewPager2, items: List<PagerItem>, viewModel: PagerViewModel
    ) {
        viewPager.adapter?.run {
            if (this is PagerAdapter) {
                this.items = items
                this.viewModel = viewModel
                this.notifyDataSetChanged()
            }
        } ?: kotlin.run {
            PagerAdapter(items, viewModel).apply {
                viewPager.adapter = this
            }
        }
    }

    @JvmStatic
    @BindingAdapter(value = ["onPageChangeListener"])
    fun setOnPageChangeListener(view: ViewPager2, listener: ViewPager2.OnPageChangeCallback) {
        view.registerOnPageChangeCallback(listener)
    }
}