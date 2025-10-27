package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1927Test : StringSpec({
    "최소 힙 : https://www.acmicpc.net/problem/1927" {
        val given = """
            9
            0
            12345678
            1
            2
            0
            0
            0
            0
            32
        """.trimIndent()
        val expected = """
            0
            1
            2
            12345678
            0
        """.trimIndent()

        No1927().solve(given.reader().buffered()) shouldBe expected
    }
})
