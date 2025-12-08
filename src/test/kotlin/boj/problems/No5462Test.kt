package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5462Test : StringSpec({
    "POI : https://www.acmicpc.net/problem/5462" {
        val given = """
            5 3 2
            0 0 1
            1 1 0
            1 0 0
            1 1 0
            1 1 0
        """.trimIndent()
        val expected = "3 2"

        No5462().solve(given.reader().buffered()) shouldBe expected
    }
})
