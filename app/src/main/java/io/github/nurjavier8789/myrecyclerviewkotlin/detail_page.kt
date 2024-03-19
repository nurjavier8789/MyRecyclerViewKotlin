package io.github.nurjavier8789.myrecyclerviewkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class detail_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details)

        val tvNama : TextView = findViewById(R.id.detail_nama)
        val tvDesk : TextView = findViewById(R.id.detail_desk)

        val Name = intent.getStringExtra(nama_extra)
        val desk = intent.getStringExtra(desk_extra)

//        tvNama.text = Name
//        tvDesk.text = desk
    }

//    override fun onItemClicked(data: Hero) {
//        setContentView(R.layout.details)
//    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.back_details -> {
                setContentView(R.layout.activity_main)
            }
        }
    }

    companion object {
        const val nama_extra = "extra_name"
        const val desk_extra = "extra_desc"
    }
}
