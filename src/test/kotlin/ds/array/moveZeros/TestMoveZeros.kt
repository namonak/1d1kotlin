package ds.array.moveZeros

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class TestMoveZeros : StringSpec({
    "testMoveZeros" {
        val testCase = arrayOf(
            row(intArrayOf(0, 5, 0, 7, 6, 3), intArrayOf(5, 7, 6, 3, 0, 0)),
            row(intArrayOf(0, 0, 0, 0, 5, 9, 3), intArrayOf(5, 9, 3, 0, 0, 0, 0)),
        )

        testCase.forEach { (given, expected) ->
            val moveZeros = MoveZeros()

            val actual = moveZeros.MoveZeros(given)

            actual shouldBe expected
        }
    }
})
