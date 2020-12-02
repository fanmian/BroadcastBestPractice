package com.leqi.broadcastbestpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login.setOnClickListener {
            val account = accountEdit.text.toString()
            val password = passwordEdit.text.toString()
            //如果账号是admin 且密码是123456，就认为登录成功
            if (account == "admin" && password == "123456") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "account or password is invalid", Toast.LENGTH_SHORT).show()

                val num1 = 100
                val num2 = 80
                val result1 = num1AndNum2(num1, num2) {n1, n2 ->
                    n1 + n2
                }
                val result2 = num1AndNum2(num1, num2) {n1, n2 ->
                    n1 - n2
                }
                println("result1 is $result1")
                println("result2 is $result2")

                val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
                val result = StringBuilder().build {
                    append("Start eating fruits.\n")
                    for (fruit in list) {
                        append(fruit).append("\n")
                    }
                    append("Ate all fruits.")
                }
                println(result.toString())
            }
        }
    }
}