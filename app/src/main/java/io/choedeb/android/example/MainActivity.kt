package io.choedeb.android.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.choedeb.android.example.recyclerView.RecyclerActivity
import io.choedeb.android.example.viewPager2.PagerActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRecyclerView.setOnClickListener {
            startActivity(Intent(this, RecyclerActivity::class.java))
        }
        btnViewPager2.setOnClickListener {
            startActivity(Intent(this, PagerActivity::class.java))
        }
    }
}
