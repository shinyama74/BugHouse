package app.nickname.myoji.bughouse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
//         (5-3)id不一致
//        val text = intent.getStringExtra("TODO_NAME")

        val text = intent.getStringExtra("TASK_NAME")
        textView.text = text

        backButton.setOnClickListener {
            finish()
        }
    }
}