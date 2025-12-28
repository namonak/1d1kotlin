package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11645Test : StringSpec({
    "I’ve Been Everywhere, Man : https://www.acmicpc.net/problem/11645" {
        val given = """
            2
            7
            saskatoon
            toronto
            winnipeg
            toronto
            vancouver
            saskatoon
            toronto
            3
            edmonton
            edmonton
            edmonton
        """.trimIndent()
        val expected = """
            4
            1
        """.trimIndent()

        No11645().solve(given.reader().buffered()) shouldBe expected
    }
})
