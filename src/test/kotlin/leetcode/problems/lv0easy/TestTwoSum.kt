package leetcode.problems.lv0easy

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class TestTwoSum : StringSpec({
    "testTwoSum" {
        val testCases = arrayOf(
            row(intArrayOf(2, 7, 11, 15), 9, intArrayOf(0, 1)),
            row(intArrayOf(3, 2, 4), 6, intArrayOf(1, 2)),
            row(intArrayOf(3, 3), 6, intArrayOf(0, 1)),
            row(intArrayOf(0, 4, 3, 0), 0, intArrayOf(0, 3)),
            row(intArrayOf(-3, 4, 3, 90), 0, intArrayOf(0, 2)),
            row(intArrayOf(-1, -2, -3, -4, -5), -8, intArrayOf(2, 4)),
        )

        val twoSum = TwoSum()

        testCases.forEach { (given0, given1, want) ->
            val actual = twoSum.twoSum(given0, given1)

            actual shouldBe want
        }
    }
})
