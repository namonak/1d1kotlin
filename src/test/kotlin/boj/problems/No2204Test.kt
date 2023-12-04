package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2204Test : StringSpec({
    "도비의 난독증 테스트 : https://www.acmicpc.net/problem/2204" {
        val given = """
            3
            Cat
            fat
            bAt
            4
            call
            ball
            All
            Hall
            0
        """.trimIndent()
        val expected = """
            bAt
            All
        """.trimIndent()

        No2204.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
