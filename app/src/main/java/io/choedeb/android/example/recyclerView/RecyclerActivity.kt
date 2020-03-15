package io.choedeb.android.example.recyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import io.choedeb.android.example.R
import io.choedeb.android.example.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler)
        val factory = RecyclerViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory).get(RecyclerViewModel::class.java)
        binding.vm = viewModel
        binding.lifecycleOwner = this
    }
}
