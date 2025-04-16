package za.ac.iie.st10480786a1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_start: Button = findViewById(R.id.btnStart)
        val edit_text: EditText = findViewById(R.id.inputTime)
        val txt_error: TextView = findViewById(R.id.errorText)
            txt_error.visibility = View.GONE

        btn_start.setOnClickListener {
            val inputText = edit_text.text.toString()
            if (inputText.equals("MORNING", ignoreCase = true)) {
                txt_error.visibility = View.GONE
                GoToMorningScreen()
            } else {
                txt_error.text = "INVALID TEXT: MORNING, MID MORNING, AFTERNOON, MID AFTERNOON, DINNER"
                txt_error.visibility = View.VISIBLE
            }
            if (inputText.equals(" MID MORNING", ignoreCase = true)) {
                txt_error.visibility = View.GONE
                GoToMidMorningScreen()
            } else {
                txt_error.text = "INVALID TEXT: MORNING, MID MORNING, AFTERNOON, MID AFTERNOON, DINNER"
                txt_error.visibility = View.VISIBLE
            }
            if (inputText.equals("AFTERNOON", ignoreCase = true)) {
                txt_error.visibility = View.GONE
                GoToAfternoonScreen()
            } else {
                txt_error.text = "INVALID TEXT: MORNING, MID MORNING, AFTERNOON, MID AFTERNOON, DINNER"
                txt_error.visibility = View.VISIBLE
            }
            if (inputText.equals("MID AFTERNOON", ignoreCase = true)) {
                txt_error.visibility = View.GONE
                GoToMidAfternoonScreen()
            } else {
                txt_error.text = "INVALID TEXT: MORNING, MID MORNING, AFTERNOON, MID AFTERNOON, DINNER"
                txt_error.visibility = View.VISIBLE
            }
            if (inputText.equals("DINNER", ignoreCase = true)) {
                txt_error.visibility = View.GONE
                GoToDinnerScreen()
            } else {
                txt_error.text = "INVALID TEXT: MORNING, MID MORNING, AFTERNOON, MID AFTERNOON, DINNER"
                txt_error.visibility = View.VISIBLE
            }
        }
    }

    private fun GoToMorningScreen() {
        val morningScreen = Intent(this, Morning::class.java)
        startActivity(morningScreen)
    }
    private fun GoToMidMorningScreen() {
        val morningScreen = Intent(this, MidMorning::class.java)
        startActivity(morningScreen)
    }
    private fun GoToAfternoonScreen() {
        val morningScreen = Intent(this, Afternoon::class.java)
        startActivity(morningScreen)
    }
    private fun GoToMidAfternoonScreen() {
        val morningScreen = Intent(this, MidAfternoon::class.java)
        startActivity(morningScreen)
    }
    private fun GoToDinnerScreen() {
        val morningScreen = Intent(this, Dinner::class.java)
        startActivity(morningScreen)
    }

}