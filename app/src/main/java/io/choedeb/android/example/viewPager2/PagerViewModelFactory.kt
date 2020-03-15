package io.choedeb.android.example.viewPager2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PagerViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PagerViewModel() as T
    }
}