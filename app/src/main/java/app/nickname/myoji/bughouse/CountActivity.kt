package app.nickname.myoji.bughouse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count.*

class CountActivity : AppCompatActivity() {
//    val number: Int = 0   (1-3)val→var
    var number: Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

//(1-1) activity_count.xmlでのidスペルミス,(1-2).toString()不足　
//        button.setOnClickListener {
//            number　+=　1
//            textView.text=number
//        }

        button.setOnClickListener {
            number += 1
            textView.text = number.toString()
        }
    }
}//(1-4)「}」の数不足



