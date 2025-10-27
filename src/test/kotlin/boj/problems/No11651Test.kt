package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11651Test : StringSpec({
    "좌표 정렬하기 2 : https://www.acmicpc.net/problem/11651" {
        val given = """
            5
            0 4
            1 2
            1 -1
            2 2
            3 3
        """.trimIndent()
        val expected = """
            1 -1
            1 2
            2 2
            3 3
            0 4
        """.trimIndent()

        No11651().solve(given.reader().buffered()) shouldBe expected
    }
})
