package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2343Test : StringSpec({
    "기타 레슨 : https://www.acmicpc.net/problem/2343" {
        val given = """
            9 3
            1 2 3 4 5 6 7 8 9
        """.trimIndent()
        val expected = "17"

        No2343().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
