package ds.binarySearch

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import org.assertj.core.api.Assertions.assertThat

class TestBinarySearch : StringSpec({
    "testBinarySearch" {
        val testCase = arrayOf(
            row(intArrayOf(1, 3, 5, 7, 9, 10, 13, 15, 17), 7, 3),
            row(intArrayOf(1, 3, 5, 7, 9, 10, 13, 15, 17), 11, -1),
            row(intArrayOf(1, 3, 5, 7, 9, 10, 13, 15, 17), 13, 6)
        )

        val binarySearch = BinarySearch()

        testCase.forEach { (nums, target, expected) ->
            val actual = binarySearch.binarySearch(nums, target)

            assertThat(actual).isEqualTo(expected)
        }
    }
})
