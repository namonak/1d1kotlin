package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No7662Test : StringSpec({
    "이중 우선순위 큐 : https://www.acmicpc.net/problem/7662" {
        val given = """
            2
            7
            I 16
            I -5643
            D -1
            D 1
            D 1
            I 123
            D -1
            9
            I -45
            I 653
            D 1
            I -642
            I 45
            I 97
            D 1
            D -1
            I 333
        """.trimIndent()
        val expected = """
            EMPTY
            333 -45
        """.trimIndent()

        No7662.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
