package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11931Test : StringSpec({
    "수 정렬하기 4 : https://www.acmicpc.net/problem/11931" {
        val given = """
            5
            1
            2
            3
            4
            5
        """.trimIndent()
        val expected = """
            5
            4
            3
            2
            1
        """.trimIndent()

        No11931.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
