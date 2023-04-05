package ds.sorting

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class TestInsertionSorting : StringSpec({
    "testInsertionSorting" {
        val given = intArrayOf(9, 3, 5, 7, 1)
        val expected = intArrayOf(1, 3, 5, 7, 9)

        val actual = InsertionSorting().sort(given)

        actual shouldBe expected
    }
})
