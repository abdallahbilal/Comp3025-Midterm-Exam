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

    override fun onCreate(savedInstanceState: Bundle?) {
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
        val SubmitButton = binding.SumbitButton
        val CancelButton = binding.CancelButton

        var Name = binding.Line1.text
        var weight = binding.editWeightText.text
        var height = binding.editHeightText.text
        var BMI = binding.BMIAnswerTextView.text
        var Age = binding.editAgeText.text

        fun calculateBMI(height: Int = 0, weight: Int = 0): Int {
            require(height > 0) { "Height must be greater than 0." }
            require(weight > 0) { "Weight must be greater than 0." }

            var bmi = weight / (height * height)
            return bmi
        }


        SubmitButton.setOnClickListener{

            var height = binding.editHeightText.text
            var weight = binding.editWeightText.text
            //val bmi = calculateBMI(height, weight)

        }

        CancelButton.setOnClickListener{

            Age.clear()
            height.clear()
            weight.clear()
            Name.clear()
        }








    }





}

