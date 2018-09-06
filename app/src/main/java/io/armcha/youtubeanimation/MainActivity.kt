package io.armcha.youtubeanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.container, VideoFragment())
                    .commit()
        }
        recyclerview.apply {
            adapter = SimpleAdapter()
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}
