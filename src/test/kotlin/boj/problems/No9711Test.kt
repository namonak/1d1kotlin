package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9711Test : StringSpec({
    "피보나치 : https://www.acmicpc.net/problem/9711" {
        val given = """
            10
            5 10
            6 25
            10 21
            32 43
            100 100
            50 50
            25 25
            45 67
            109 32
            128 128
        """.trimIndent()
        val expected = """
            Case #1: 5
            Case #2: 8
            Case #3: 13
            Case #4: 15
            Case #5: 75
            Case #6: 25
            Case #7: 0
            Case #8: 19
            Case #9: 9
            Case #10: 69
        """.trimIndent()

        No9711().solve(given.reader().buffered()) shouldBe expected
    }
})
