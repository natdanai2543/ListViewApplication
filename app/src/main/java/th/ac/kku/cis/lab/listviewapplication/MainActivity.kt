package th.ac.kku.cis.lab.listviewapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnListView = findViewById<Button>(R.id.buttonSimpleListView)
btnListView.setOnClickListener {
    val intent = Intent(this, ListViewActivity::class.java)
    startActivities(arrayOf(intent))
}
        var btnCustomListView = findViewById<Button>(R.id.buttonCustomListView)
    btnCustomListView.setOnClickListener{
        Intent(this, CustomListActivity::class.java).also{
            startActivity(it)
        }
    }
    }
}