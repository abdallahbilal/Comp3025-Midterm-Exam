package ca.georgiancollege.midtermexam

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ca.georgiancollege.midtermexam.databinding.ActivityMainBinding

/*
*
* Abdallah Bilal
* 200494848
* Tuesday June 18th 2024
* Comp 3025 Midterm Exam
*
* */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)


        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        createButtonReferences()
}

    private fun createButtonReferences(): Unit {
        val twoButtons = arrayOf(
            binding.SumbitButton, binding.CancelButton
        )

    }









}