package ds.array.findPivotIndex

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class TestPivotIndex : StringSpec({
    "testPivotIndex" {
        // define test cases
        val testCase = arrayOf(
            row(intArrayOf(1, 8, 2, 9, 2, 3, 6), 3),
            row(intArrayOf(2, 5, 7), -1)
        )

        testCase.forEach { (given, expected) ->
            val pivotIndex = PivotIndex()

            val actual = pivotIndex.pivotIndex(given)

            actual shouldBe expected
        }
    }
})
