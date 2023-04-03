package ds.sorting

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class TestHeapSorting : StringSpec({
    "testHeapSorting" {
        // given
        val given = arrayOf(3, 5, 7, 9, 4, 2)
        val expected = arrayOf(2, 3, 4, 5, 7, 9)

        // when
        val actual = HeapSorting().sort(given)

        // then
        actual shouldBe expected
    }
})
