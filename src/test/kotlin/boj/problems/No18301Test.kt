package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No18301Test : StringSpec({
    "Rats : https://www.acmicpc.net/problem/18301" {
        val given = """
            15 18 11
        """.trimIndent()
        val expected = "24"

        No18301().solve(given.reader().buffered()) shouldBe expected
    }
})
