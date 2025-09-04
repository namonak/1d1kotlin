package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25707Test : StringSpec({
    "팔찌 만들기 : https://www.acmicpc.net/problem/25707" {
        val given = """
            5
            7 9 5 1 3
        """.trimIndent()
        val expected = "16"

        val result = No25707().solve(given.reader().buffered())
        result shouldBe expected
    }
})
