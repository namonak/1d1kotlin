package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15351Test : StringSpec({
    "인생 점수 : https://www.acmicpc.net/problem/15351" {
        val given = """
            4
            OTAKU LIFE
            PRODUCER
            GAMING LIFE
            PROGRAMMING
        """.trimIndent()
        val expected = """
            PERFECT LIFE
            PERFECT LIFE
            83
            131
        """.trimIndent()

        No15351().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
