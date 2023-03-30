package ds.sorting

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class TestBubbleSorting : StringSpec({
    "testBubbleSorting" {
        // given
        val given = arrayOf(9, 3, 5, 7, 1)
        val expected = arrayOf(1, 3, 5, 7, 9)

        // when
        val actual = BubbleSorting().sort(given)

        // then
        actual shouldBe expected
    }
})
