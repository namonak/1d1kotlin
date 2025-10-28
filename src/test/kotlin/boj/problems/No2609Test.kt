package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2609Test : StringSpec({
    "최대공약수와 최소공배수 : https://www.acmicpc.net/problem/2609" {
        val given = "24 18"
        val expected = """
            6
            72
        """.trimIndent()

        No2609().solve(given.reader().buffered()) shouldBe expected
    }
})
