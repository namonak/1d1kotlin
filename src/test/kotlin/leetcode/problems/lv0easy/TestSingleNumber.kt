package leetcode.problems.lv0easy

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class TestSingleNumber : StringSpec({
    "testSingleNumber" {
        val testCases = arrayOf(
            row(intArrayOf(2, 2, 1), 1),
            row(intArrayOf(4, 1, 2, 1, 2), 4),
            row(intArrayOf(1), 1),
        )

        val singleNumber = SingleNumber()

        testCases.forEach { (given, want) ->
            val actual = singleNumber.singleNumber(given)

            actual shouldBe want
        }
    }
})
