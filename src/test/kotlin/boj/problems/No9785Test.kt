package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9785Test : StringSpec({
    "Damage Over Time : https://www.acmicpc.net/problem/9785" {
        val given = """
            3 2
            15 10
            7 3
            7 2
        """.trimIndent()
        val expected = "22 3"

        No9785().solve(given.reader().buffered()) shouldBe expected
    }
})
