package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5648Test : StringSpec({
    "역원소 정렬 : https://www.acmicpc.net/problem/5648" {
        val given = """
            10 5 2233
            1601 90100 13009 802
            50000000
            301 7654321
            210
        """.trimIndent()
        val expected = """
            5
            5
            12
            103
            109
            208
            1061
            3322
            90031
            1234567
        """.trimIndent()

        No5648().solve(given.reader().buffered()) shouldBe expected
    }
})
