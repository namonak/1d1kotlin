package leetcode.problems.lv0easy

import junit.framework.TestCase.assertEquals
import org.junit.Test

data class AddBinaryTestcase(val given1: String, val given2: String, val wanted: String)
class TestAddBinary {
    private val mAddBinaryTestcase = arrayOf(
        AddBinaryTestcase("11", "1", "100"),
        AddBinaryTestcase("1010", "1011", "10101"),
    )

    @Test
    fun testAddBinary() {
        for (testcase in mAddBinaryTestcase) {
            val addBinary = AddBinary()
            assertEquals(addBinary.addBinary(testcase.given1, testcase.given2), testcase.wanted)
        }
    }
}