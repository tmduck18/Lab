package com.example.diceroll

    import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImage = findViewById(R.id.dice_image)

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetDice() }
        diceEmpty = findViewById(R.id.dice_image)
    }

    lateinit var diceImage : ImageView
    lateinit var diceEmpty : ImageView

    private fun resetDice() {
//        val resetInt = 0
//        val resetText: TextView = findViewById(R.id.result_text)
//        resetText.text = resetInt.toString()

        diceEmpty.setImageResource(R.drawable.empty_dice)

    }



    private fun rollDice() {
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()

        val randomInt = (1..6).random()

//        val resultText: TextView = findViewById(R.id.result_text)
//        val diceImage: ImageView = findViewById(R.id.dice_image)

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
//        resultText.text = "Dice Rolled!"
//        resultText.text = randomInt.toString()
        diceImage.setImageResource(drawableResource)
    }
}