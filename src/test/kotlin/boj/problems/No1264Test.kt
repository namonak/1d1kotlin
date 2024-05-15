package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1264Test : StringSpec({
    "모음의 개수 : https://www.acmicpc.net/problem/1264" {
        val given = """
            How are you today?
            Quite well, thank you, how about yourself?
            I live at number twenty four.
            #
        """.trimIndent()
        val expected = """
            7
            14
            9
        """.trimIndent()

        No1264().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
