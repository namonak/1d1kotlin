package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3059Test : StringSpec({
    "등장하지 않는 문자의 합 : https://www.acmicpc.net/problem/3059" {
        val given = """
            2
            ABCDEFGHIJKLMNOPQRSTUVW
            A
        """.trimIndent()
        val expected = """
            267
            1950
        """.trimIndent()

        No3059.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
