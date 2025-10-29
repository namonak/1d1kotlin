package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5218Test : StringSpec({
    "알파벳 거리 : https://www.acmicpc.net/problem/5218" {
        val given = """
            5
            AAAA ABCD
            ABCD AAAA
            DARK LOKI
            STRONG THANOS
            DEADLY ULTIMO
        """.trimIndent()
        val expected = """
            Distances: 0 1 2 3
            Distances: 0 25 24 23
            Distances: 8 14 19 24
            Distances: 1 14 9 25 1 12
            Distances: 17 7 19 5 1 16
        """.trimIndent()

        No5218().solve(given.reader().buffered()) shouldBe expected
    }
})
