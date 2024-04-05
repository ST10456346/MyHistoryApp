package com.example.st10456346.myhistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //This is were my Declarations start

        val generatebutton = findViewById<Button>(R.id.generatebutton)
        val clearbutton = findViewById<Button>(R.id.clearbutton)
        val agenumbertext = findViewById<EditText>(R.id.textview)
        val resultview = findViewById<TextView>(R.id.resultview)
        generatebutton.setOnClickListener {

            //if else statement
            val age = agenumbertext.text.toString().toIntOrNull()
            if (age == null) {
                resultview.text = "please enter a valid age"


            } else {
                if (age < 20 || age > 100) {
                    resultview.text = "please enter a valid age between 20 to 100"
                    agenumbertext.text.clear()

                } else {

                    val result = when (age) {
                        56 -> "Adolf Hitler was chancellor of Germany from 1933 to 1945, serving as dictator and leader of the Nazi Party, " +
                                "or National Socialist German Workers Party, for the bulk of his time in power"
                        39 -> "Ricky Rick, was a South African rapper, producer, singer, songwriter, and fashion designer " +
                                "who rose to mainstream fame from his hit single Nafukwa was released in 2014"
                        74 -> "Muhammad Ali was a boxer, philanthropist, and social activist " +
                                "who is universally regarded as one of the greatest athletes of the 20th century"
                        76 -> "Albert Einstein was a German mathematician and physicist who developed the special and general theories of relativity"
                        24 -> "Christopher George Latore Wallace, better known by his stage names The Notorious B.I.G., Biggie Smalls, or simply Biggie, was an American rapper." +
                                " Rooted in East Coast hip hop and particularly gangster rap, he is widely considered one of the greatest rappers of all time"
                        30 -> "Eric Lynn Wright, known professionally as Eazy-E was an American rapper who propelled West Coast rap and gangster rap by leading the group N.W.A and its label, Ruthless Records." +
                                "He is often referred to as the (Godfather of Gangster Rap)."
                        36 -> "Robert Nesta Marley, known professionally as Bob Marley was a Jamaican singer-songwriter whose distillation of early sky, rock steady, " +
                                "and reggae musical forms blossomed in the 1970s into an electrifying rock-influenced hybrid that made him an international superstar."
                        84 -> "Isaac Newton was a physicist and mathematician who developed the principles of modern physics," +
                                " including the laws of motion and is credited as one of the great minds of the 17th-century Scientific Revolution."
                        39 -> "Martin Luther King Jr. was a social activist and Baptist minister who played a key role in the American civil rights movement from the mid-1950s until his assassination in 1968." +
                                " King sought equality and human rights for African Americans, the economically disadvantaged and all victims of injustice through peaceful protest."
                        63 -> "Robin Williams was an actor and comedian. He first gained popularity through his role on the television show Mork & Mindy," +
                                " before transitioning into leading parts, both comedic and dramatic, in film."

                        else -> "no one died here"

                    }
                    resultview.text = result

                }

            }
            clearbutton.setOnClickListener {
                agenumbertext.text.clear()
                resultview.text = ""
            }


        }


    }

    }
