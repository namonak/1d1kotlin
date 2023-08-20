package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No12605Test : StringSpec({
    "단어순서 뒤집기 : https://www.acmicpc.net/problem/12605" {
        val given = """
            3
            this is a test
            foobar
            all your base
        """.trimIndent()
        val output = """
            Case #1: test a is this
            Case #2: foobar
            Case #3: base your all
        """.trimIndent()

        No12605.solve(BufferedReader(given.reader())) shouldBe output
    }
})
