package io.choedeb.android.example.recyclerView

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecyclerViewModel : ViewModel() {

    private val _items = MutableLiveData<List<SampleItem>>()
    val items : LiveData<List<SampleItem>> = _items

    init {
        val mockItem = ArrayList<SampleItem>()
        mockItem.add(SampleItem("타이틀1", "서브타이틀1"))
        mockItem.add(SampleItem("타이틀2", "서브타이틀2"))
        mockItem.add(SampleItem("타이틀3", "서브타이틀3"))
        mockItem.add(SampleItem("타이틀4", "서브타이틀4"))
        mockItem.add(SampleItem("타이틀5", "서브타이틀5"))
        mockItem.add(SampleItem("타이틀6", "서브타이틀6"))

        _items.value = mockItem
    }

    fun onItemClicked() {
        //리스트 클릭 이벤트
    }
}