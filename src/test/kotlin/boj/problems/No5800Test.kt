package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5800Test : StringSpec({
    "성적 통계 : https://www.acmicpc.net/problem/5800" {
        val givne = """
            2
            5 30 25 76 23 78
            6 25 50 70 99 70 90
        """.trimIndent()
        val expected = """
            Class 1
            Max 78, Min 23, Largest gap 46
            Class 2
            Max 99, Min 25, Largest gap 25
        """.trimIndent()

        No5800().solve(givne.reader().buffered()) shouldBe expected
    }
})
