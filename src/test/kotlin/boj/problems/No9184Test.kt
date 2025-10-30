package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9184Test : StringSpec({
    "신나는 함수 실행 : https://www.acmicpc.net/problem/9184" {
        val given = """
            1 1 1
            2 2 2
            10 4 6
            50 50 50
            -1 7 18
            -1 -1 -1
        """.trimIndent()
        val expected = """
            w(1, 1, 1) = 2
            w(2, 2, 2) = 4
            w(10, 4, 6) = 523
            w(50, 50, 50) = 1048576
            w(-1, 7, 18) = 1
        """.trimIndent()

        No9184().solve(given.reader().buffered()) shouldBe expected
    }
})
