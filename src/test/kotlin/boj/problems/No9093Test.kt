package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9093Test : StringSpec({
    "단어 뒤집기 : https://www.acmicpc.net/problem/9093" {
        val given = """
            2
            I am happy today
            We want to win the first prize
        """.trimIndent()
        val expected = """
            I ma yppah yadot
            eW tnaw ot niw eht tsrif ezirp
        """.trimIndent()

        No9093().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
