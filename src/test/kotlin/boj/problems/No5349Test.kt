package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5349Test : StringSpec({
    "Duplicate SSN : https://www.acmicpc.net/problem/5349" {
        val given = """
            555-44-6666
            111-99-4444
            012-00-1111
            888-98-9086
            555-44-6666
            234-54-3425
            012-00-1111
            555-44-6666
            000-00-0000
        """.trimIndent()
        val expected = """
            012-00-1111
            555-44-6666
        """.trimIndent()

        No5349().solve(given.reader().buffered()) shouldBe expected
    }
})
