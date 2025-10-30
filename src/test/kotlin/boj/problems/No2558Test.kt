package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2558Test : StringSpec({
    "A+B - 2 : https://www.acmicpc.net/problem/2558" {
        val given = """
            1
            2
        """.trimIndent()
        val expected = "3"

        No2558().solve(given.reader().buffered()) shouldBe expected
    }
})
