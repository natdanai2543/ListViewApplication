package th.ac.kku.cis.lab.listviewapplication

import android.content.Intent
import android.icu.number.Notation.simple
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val names = arrayOf<String>("Android","iOS", "Windows", "Chrome OS","Linux")

        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)

        val simpleListView = findViewById<ListView>(R.id.simpleListView)
        simpleListView.adapter = arrayAdapter

        simpleListView.setOnItemClickListener { parent, view, position, id ->
val selectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(this, selectedItem, Toast.LENGTH_SHORT).show()

            Intent(this,NameActivity::class.java).also{
                it.putExtra("EXTRA_SELECTED_NAME", selectedItem)
                it.putExtra("EXTRA_ID", id)
                startActivity(it)
            }
        }

    }
}