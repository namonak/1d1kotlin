package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10820Test : StringSpec({
    "문자열 분석 : https://www.acmicpc.net/problem/10820" {
        val given = """
            This is String
            SPACE    1    SPACE
             S a M p L e I n P u T     
            0L1A2S3T4L5I6N7E8
        """.trimIndent()
        val expected = """
            10 2 0 2
            0 10 1 8
            5 6 0 16
            0 8 9 0
        """.trimIndent()

        No10820().solve(given.reader().buffered()) shouldBe expected
    }
})
