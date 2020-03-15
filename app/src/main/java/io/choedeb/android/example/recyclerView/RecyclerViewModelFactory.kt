package io.choedeb.android.example.recyclerView

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class RecyclerViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RecyclerViewModel() as T
    }
}