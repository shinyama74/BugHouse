package app.nickname.myoji.bughouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
//    private val taskList: List<Task> = listOf(  (5-1)List→書き換え可能なmutableList
    private var taskList: MutableList<Task> = mutableListOf(
        Task("Task 1"),
        Task("Task 2"),
        Task("Task 3")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val adapter = TaskAdapter(this, object: TaskAdapter.ItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(this@ListActivity, DetailActivity::class.java)
                intent.putExtra("TASK_NAME", taskList[position].name)
                //(5-4)startActivity不足
                startActivity(intent)
            }
        })

        recyclerView.layoutManager = LinearLayoutManager(this)
        //(5-2)adapterの設定不足
        recyclerView.adapter =adapter

        adapter.addAll(taskList)

        addButton.setOnClickListener {
            val name = editText.text.toString()

            //(5-5)addAll(taskList)は既存のデータも再代入してしまう
            val newTask=Task(name)
            taskList.add(newTask)
            adapter.add(newTask)
            adapter.notifyDataSetChanged()
        }
    }

}