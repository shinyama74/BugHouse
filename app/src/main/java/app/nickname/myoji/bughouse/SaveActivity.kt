package app.nickname.myoji.bughouse

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_save.*

class SaveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)

        val sharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)

        saveButton.setOnClickListener {
            //      val text = input.text   (2-2).toString()不足(2-4)val→var
            var text = input.text.toString()
            val editor = sharedPreferences.edit()
            editor.putString("SAVE", text)
            //(2-3)追加。ファイル書き込みが非同期で行われるからスレッド占有が短い。らしい。
            editor.apply()
        }
    }

//    (2-1)fun onCreate内へ移動
//    val sharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)
//    val editor = sharedPreferences.edit()
//    saveButton.setOnClickListener {
//        val text = input.text
//        editor.putString("SAVE", text)
//    }
}
