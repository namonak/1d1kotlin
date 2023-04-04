package leetcode.problems.lv0easy

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class TestPlusOne : StringSpec({
    "testPlusOne" {
        val testCases = arrayOf(
            row(intArrayOf(1, 2, 3), intArrayOf(1, 2, 4)),
            row(intArrayOf(4, 3, 2, 1), intArrayOf(4, 3, 2, 2)),
            row(intArrayOf(9), intArrayOf(1, 0)),
            row(intArrayOf(9, 9), intArrayOf(1, 0, 0)),
            row(intArrayOf(9, 9, 9), intArrayOf(1, 0, 0, 0))
        )

        testCases.forEach { (given, expected) ->
            val actual = PlusOne().plusOne(given)

            actual shouldBe expected
        }
    }
})
