package io.choedeb.android.example.viewPager2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.viewpager2.widget.ViewPager2

class PagerViewModel : ViewModel() {

    private val _items = MutableLiveData<List<PagerItem>>()
    val items : LiveData<List<PagerItem>> = _items

    init {
        val mockItems = ArrayList<PagerItem>()
        mockItems.add(PagerItem("페이지1", "페이지 서브 타이틀1"))
        mockItems.add(PagerItem("페이지2", "페이지 서브 타이틀2"))
        mockItems.add(PagerItem("페이지3", "페이지 서브 타이틀3"))

        _items.value = mockItems
    }

    var pageChangeListener = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            //뷰페이저 리스너 이벤트
        }
    }
}