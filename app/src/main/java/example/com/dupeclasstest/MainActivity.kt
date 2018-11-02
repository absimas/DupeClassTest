package example.com.dupeclasstest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.MyClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyClass()
    }
}
