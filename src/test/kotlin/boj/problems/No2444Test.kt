package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2444Test : StringSpec({
    "별 찍기 - 7 : https://www.acmicpc.net/problem/2444" {
        val given = "5"
        val expected = """
            |    *
            |   ***
            |  *****
            | *******
            |*********
            | *******
            |  *****
            |   ***
            |    *
        """.trimMargin()

        No2444().solve(given.reader().buffered()) shouldBe expected
    }
})
