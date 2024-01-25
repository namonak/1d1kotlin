package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No29701Test : StringSpec({
    "모스 부호 : https://www.acmicpc.net/problem/29701" {
        val given = """
            5
            .... . .-.. .-.. ---
        """.trimIndent()
        val expected = "HELLO"

        No29701.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
