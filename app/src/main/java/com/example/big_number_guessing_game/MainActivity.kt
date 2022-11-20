package com.example.big_number_guessing_game

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.github.jinatonic.confetti.CommonConfetti
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val txt_score : TextView = findViewById(R.id.txt_score)

        leftButton.setOnClickListener {

            checkAnswer(true)
            assignnewnumbers()

        }


        rightButton.setOnClickListener {

            checkAnswer(false)
            assignnewnumbers()

        }

    }

    private fun checkAnswer(isleftBtnSelected: Boolean) {

        val left_num: Int = leftButton.text.toString().toInt()
        val right_num: Int = rightButton.text.toString().toInt()
        var answer = if (isleftBtnSelected) left_num > right_num else left_num < right_num

        if (answer) {
            constraintlayout.setBackgroundColor(Color.GREEN)
            Toast.makeText(this, "Correct!!", Toast.LENGTH_SHORT).show()
            counter = counter + 1
        } else {
            constraintlayout.setBackgroundColor(Color.RED)
            Toast.makeText(this, "Wrong..", Toast.LENGTH_SHORT).show()
            counter = 0
        }

        val centerX: Int = constraintlayout.width / 2
        val centerY: Int = constraintlayout.height / 5 * 2



        txt_score.text = counter.toString()
        when (counter) {

            100 -> {
                CommonConfetti.rainingConfetti(
                    constraintlayout,
                    intArrayOf(Color.RED, Color.GREEN, Color.BLUE)
                ).oneShot()
                CommonConfetti.explosion(
                    constraintlayout,
                    centerX,
                    centerY,
                    intArrayOf(Color.YELLOW, Color.MAGENTA, Color.BLACK)
                ).oneShot()
            }
            200 -> {
                CommonConfetti.rainingConfetti(
                    constraintlayout,
                    intArrayOf(Color.RED, Color.GREEN, Color.BLUE)
                ).oneShot()
                CommonConfetti.explosion(
                    constraintlayout,
                    centerX,
                    centerY,
                    intArrayOf(Color.YELLOW, Color.MAGENTA, Color.BLACK)
                ).oneShot()
            }
            300 -> {
                CommonConfetti.rainingConfetti(
                    constraintlayout,
                    intArrayOf(Color.RED, Color.GREEN, Color.BLUE)
                ).oneShot()
                CommonConfetti.explosion(
                    constraintlayout,
                    centerX,
                    centerY,
                    intArrayOf(Color.YELLOW, Color.MAGENTA, Color.BLACK)
                ).oneShot()
            }
            400 -> {
                CommonConfetti.rainingConfetti(
                    constraintlayout,
                    intArrayOf(Color.RED, Color.GREEN, Color.BLUE)
                ).oneShot()
                CommonConfetti.explosion(
                    constraintlayout,
                    centerX,
                    centerY,
                    intArrayOf(Color.YELLOW, Color.MAGENTA, Color.BLACK)
                ).oneShot()
            }
            500 -> {
                CommonConfetti.rainingConfetti(
                    constraintlayout,
                    intArrayOf(Color.RED, Color.GREEN, Color.BLUE)
                ).oneShot()
                CommonConfetti.explosion(
                    constraintlayout,
                    centerX,
                    centerY,
                    intArrayOf(Color.YELLOW, Color.MAGENTA, Color.BLACK)
                ).oneShot()
            }
            600 -> {
                CommonConfetti.rainingConfetti(
                    constraintlayout,
                    intArrayOf(Color.RED, Color.GREEN, Color.BLUE)
                ).oneShot()
                CommonConfetti.explosion(
                    constraintlayout,
                    centerX,
                    centerY,
                    intArrayOf(Color.YELLOW, Color.MAGENTA, Color.BLACK)
                ).oneShot()

            }
            700 -> {
                CommonConfetti.rainingConfetti(
                    constraintlayout,
                    intArrayOf(Color.RED, Color.GREEN, Color.BLUE)
                ).oneShot()
                CommonConfetti.explosion(
                    constraintlayout,
                    centerX,
                    centerY,
                    intArrayOf(Color.YELLOW, Color.MAGENTA, Color.BLACK)
                ).oneShot()
            }
            800 -> {
                CommonConfetti.rainingConfetti(
                    constraintlayout,
                    intArrayOf(Color.RED, Color.GREEN, Color.BLUE)
                ).oneShot()
                CommonConfetti.explosion(
                    constraintlayout,
                    centerX,
                    centerY,
                    intArrayOf(Color.YELLOW, Color.MAGENTA, Color.BLACK)
                ).oneShot()
            }
            900 -> {
                CommonConfetti.rainingConfetti(
                    constraintlayout,
                    intArrayOf(Color.RED, Color.GREEN, Color.BLUE)
                ).oneShot()
                CommonConfetti.explosion(
                    constraintlayout,
                    centerX,
                    centerY,
                    intArrayOf(Color.YELLOW, Color.MAGENTA, Color.BLACK)
                ).oneShot()
            }
            1000 -> {
                CommonConfetti.rainingConfetti(
                    constraintlayout,
                    intArrayOf(Color.RED, Color.GREEN, Color.BLUE)
                ).oneShot()
                CommonConfetti.explosion(
                    constraintlayout,
                    centerX,
                    centerY,
                    intArrayOf(Color.YELLOW, Color.MAGENTA, Color.BLACK)
                ).oneShot()
            }
        }
    }

    private fun assignnewnumbers() {
        val random_num = Random()

        val left_num: Int = random_num.nextInt(10)
        var right_num: Int = left_num

        while (right_num == left_num) {
            right_num = random_num.nextInt(10)
        }
        leftButton.text = left_num.toString()
        rightButton.text = right_num.toString()
    }


}