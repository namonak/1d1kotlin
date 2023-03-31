package leetcode.problems.lv0easy

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class TestAddBinary : StringSpec({
    "testAddBinary" {
        val testCases = arrayOf(
            row("11", "1", "100"),
            row("1010", "1011", "10101"),
        )

        testCases.forEach { (given1, given2, expected) ->
            val actual = AddBinary().addBinary(given1, given2)

            actual shouldBe expected
        }
    }
})
