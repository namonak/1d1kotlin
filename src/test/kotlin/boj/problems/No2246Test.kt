package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2246Test : StringSpec({
    "콘도 선정 : https://www.acmicpc.net/problem/2246" {
        val given = """
            5
            300 100
            100 300
            400 200
            200 400
            100 500
        """.trimIndent()
        val expected = "2"

        No2246().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
