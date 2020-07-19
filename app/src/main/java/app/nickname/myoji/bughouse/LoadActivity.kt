package app.nickname.myoji.bughouse

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count.*

class LoadActivity : AppCompatActivity() {

//    override fun onDestroy() {
//    super.onDestroy()
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)

//        val sharedPreferences = getSharedPreferences("Third", Context.MODE_PRIVATE)  (3-1)呼び出しキーの不一致
//        textView.text = sharedPreferences.getString("save", "")　　(3-2)キーの大文字小文字
        val sharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)
        val textView=findViewById<TextView>(R.id.textView)
        textView.text = sharedPreferences.getString("SAVE", "EMPTY")
    }
}
