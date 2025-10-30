package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2139Test : StringSpec({
    "나는 너가 살아온 날을 알고 있다 : https://www.acmicpc.net/problem/2139" {
        val given = """
            14 8 2004
            1 1 2004
            31 1 1976
            1 3 1974
            1 3 1976
            0 0 0
        """.trimIndent()
        val expected = """
            227
            1
            31
            60
            61
        """.trimIndent()

        No2139().solve(given.reader().buffered()) shouldBe expected
    }
})
