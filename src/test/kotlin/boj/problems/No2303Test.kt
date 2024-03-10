package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2303Test : StringSpec({
    "숫자 게임 : https://www.acmicpc.net/problem/2303" {
        val given = """
            3
            7 5 5 4 9
            1 1 1 1 1
            2 3 3 2 10
        """.trimIndent()
        val expected = "1"

        No2303().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
