package th.ac.kku.cis.lab.listviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class CustomListActivity : AppCompatActivity() {

    //val name = arrayOf<String>("Natdanai Wintachai", "Aueaoangkun Sroiaudom", "Thanakorn Piromchai")
    //val id = arrayOf<String>("#CIS ID : 623410049-4", "#CIS ID :623410059-1","#CIS ID : 623410034-7")

    val name = arrayOf<String>("Natdanai Wintachai", "Aueaoangkun Sroiaudom")
    val id = arrayOf<String>("#CIS ID : ", "#CIS ID :")
    val img = arrayOf<Int>(R.drawable.a, R.drawable.b)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list)

        val myAdapter = CustomListAdapter(this,name,id,img)
        val listview = findViewById<ListView>(R.id.custom_list_view)
        listview.adapter = myAdapter
    }
}