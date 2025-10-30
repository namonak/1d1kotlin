package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No7795Test : StringSpec({
    "먹을 것인가 먹힐 것인가 : https://www.acmicpc.net/problem/7795" {
        val given = """
            2
            5 3
            8 1 7 3 1
            3 6 1
            3 4
            2 13 7
            103 11 290 215
        """.trimIndent()
        val expected = """
            7
            1
        """.trimIndent()

        No7795().solve(given.reader().buffered()) shouldBe expected
    }
})
