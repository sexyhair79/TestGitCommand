package cm.jiege.testgitcommand

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var text1:String = "这是在branch-1分支上"+"第一次修改"
    private var text2:String = "这是在branch-1分支上"+"第二次修改"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
