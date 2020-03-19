package com.beflukey.androidpitestingexample

import org.junit.Assert
import org.junit.Test

class ArithmatiserTest {

    private val arithmatiser: Arithmatiser = Arithmatiser()

    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, arithmatiser.add(2, 2))
    }

    @Test
    fun subtraction_isCorrect() {
        Assert.assertEquals(0, arithmatiser.subtract(2, 2))
    }

}
