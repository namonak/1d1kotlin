package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No29863Test : StringSpec({
    "Arno's Sleep Schedule : https://www.acmicpc.net/problem/29863" {
        val given = """
            23
            7
        """.trimIndent()
        val expected = "8"

        val result = No29863().solve(given.reader().buffered())
        result shouldBe expected
    }
})
