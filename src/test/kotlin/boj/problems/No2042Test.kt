package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2042Test : StringSpec({
    "구간 합 구하기 : https://www.acmicpc.net/problem/2042" {
        val given = """
            5 2 2
            1
            2
            3
            4
            5
            1 3 6
            2 2 5
            1 5 2
            2 3 5
        """.trimIndent()
        val expected = """
            17
            12
        """.trimIndent()

        No2042().solve(given.reader().buffered()) shouldBe expected
    }
})
