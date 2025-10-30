package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11399Test : StringSpec({
    "ATM : https://www.acmicpc.net/problem/11399" {
        val given = """
            5
            3 1 4 3 2
        """.trimIndent()
        val expected = "32"

        val actual = No11399().solve(given.reader().buffered())

        actual shouldBe expected
    }
})
