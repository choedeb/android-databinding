package io.choedeb.android.example.viewPager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import io.choedeb.android.example.R
import io.choedeb.android.example.databinding.ActivityPagerBinding

class PagerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPagerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_pager)
        val factory = PagerViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory).get(PagerViewModel::class.java)
        binding.vm = viewModel
        binding.lifecycleOwner = this
    }
}
