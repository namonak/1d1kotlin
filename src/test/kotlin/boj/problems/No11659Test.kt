package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11659Test : StringSpec({
    "구간 합 구하기 4 : https://www.acmicpc.net/problem/11659" {
        val given = """
            5 3
            5 4 3 2 1
            1 3
            2 4
            5 5
        """.trimIndent()
        val expected = """
            12
            9
            1
        """.trimIndent()

        No11659().solve(given.reader().buffered()) shouldBe expected
    }
})
