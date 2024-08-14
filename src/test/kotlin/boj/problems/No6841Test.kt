package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No6841Test : StringSpec({
    "I Speak TXTMSG : https://www.acmicpc.net/problem/6841" {
        val given = """
            CCC
            :-)
            SQL
            TTYL
        """.trimIndent()
        val expected = """
            Canadian Computing Competition
            I’m happy
            SQL
            talk to you later
        """.trimIndent()

        No6841().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
