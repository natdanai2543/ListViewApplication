package th.ac.kku.cis.lab.listviewapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val selectedName = intent.getStringExtra("EXTRA_SELECTED_NAME")
        val id = intent.getIntExtra("EXTRA_ID", 0)

        val tvName = findViewById<TextView>(R.id.tvName)
        tvName.text = id.toString() + "" + selectedName


    }
}