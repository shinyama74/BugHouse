package app.nickname.myoji.bughouse

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.getString
import android.provider.Settings.Secure.getString
import android.provider.Settings.System.getString
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_save.*

class SaveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)
//        setContentView(R.layout.activity_load)   (2-4)activityの参照先ミス

        val sharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()


        saveButton.setOnClickListener {
            //val text = input.text   (2-2).toString()不足
            val text = input.text.toString()

            editor.putString("SAVE", text)
            //(2-3)追加。ファイル書き込みが非同期で行われるからスレッド占有が短い。らしい。
            editor.apply()

//            //デバッグ用
//            val toast = Toast.makeText(applicationContext, sharedPreferences.getString("SAVE","EMPTY")+"を保存しました", Toast.LENGTH_LONG)
//            toast.show()
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
