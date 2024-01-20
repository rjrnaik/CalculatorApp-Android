package ca.rjrnaik.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    private lateinit var e1 : EditText
    private lateinit var e2 : EditText
    private lateinit var res : TextView

    private lateinit var btnAdd : Button
    private lateinit var btnSub : Button
    private lateinit var btnMul : Button
    private lateinit var btnDiv : Button
    private lateinit var btnMod : Button
    private lateinit var btnPow : Button
    private lateinit var btnPerc : Button
    private lateinit var btnClear : Button
    private lateinit var btnClose : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMul = findViewById(R.id.btnMul)
        btnDiv = findViewById(R.id.btnDiv)
        btnMod = findViewById(R.id.btnMod)
        btnPow = findViewById(R.id.btnPow)
        btnPerc = findViewById(R.id.btnPerc)
        btnClear = findViewById(R.id.btnClear)
        btnClose = findViewById(R.id.btnClose)

        e1 = findViewById(R.id.num1)
        e2 = findViewById(R.id.num2)

        res = findViewById(R.id.result)

        fun checkNullValues() : Boolean{
            if (e1.text.toString().isBlank()) {
                Toast.makeText(this,"Enter Num1 Value", Toast.LENGTH_SHORT).show()
                return false
            }
            if (e2.text.toString().isBlank()) {
                Toast.makeText(this,"Enter Num2 Value", Toast.LENGTH_SHORT).show()
                return false
            }
            return true
            }

        btnAdd.setOnClickListener {
            if (checkNullValues()) {
                val num1 = e1.text.toString().toInt()
                val num2 = e2.text.toString().toInt()
                val sum = num1 + num2
                res.text = sum.toString()
            }
        }

        btnSub.setOnClickListener {
            if (checkNullValues()) {
                val num1 = e1.text.toString().toInt()
                val num2 = e2.text.toString().toInt()
                val diff = num1 - num2
                res.text = diff.toString()
            }
        }

        btnMul.setOnClickListener {
            if (checkNullValues()) {
                val num1 = e1.text.toString().toInt()
                val num2 = e2.text.toString().toInt()
                val prod = num1 * num2
                res.text = prod.toString()
            }
        }

        btnDiv.setOnClickListener {
            if (checkNullValues()) {
                val num1 = e1.text.toString().toInt()
                val num2 = e2.text.toString().toInt()
                val div = num1 / num2
                res.text = div.toString()
            }
        }

        btnMod.setOnClickListener {
            if (checkNullValues()) {
                val num1 = e1.text.toString().toInt()
                val num2 = e2.text.toString().toInt()
                val mod = num1 % num2
                res.text = mod.toString()
            }
        }

        btnPow.setOnClickListener {
            if (checkNullValues()) {
                val num1 = e1.text.toString().toDouble()
                val num2 = e2.text.toString().toDouble()
                val pow = num1.pow(num2)
                res.text = pow.toString()
            }
        }

        btnPerc.setOnClickListener {
            if (checkNullValues()) {
                val num1 = e1.text.toString().toDouble()
                val num2 = e2.text.toString().toDouble()
                val div = (num1 / num2) * 100
                res.text = div.toString()
            }
        }

        btnClear.setOnClickListener {
                e1.text.clear()
                e2.text.clear()
                res.text = ""

        }

        btnClose.setOnClickListener {
            finish()
            exitProcess(0)
        }
    }
}
