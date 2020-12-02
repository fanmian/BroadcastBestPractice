package com.leqi.broadcastbestpractice

import java.lang.StringBuilder

inline fun num1AndNum2(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    val result = operation(num1, num2)
    return result
}

inline fun StringBuilder.build(block: StringBuilder.() -> Unit): StringBuilder {
    block()
    return this
}