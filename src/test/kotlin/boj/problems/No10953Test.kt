package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10953Test : StringSpec({
    "A+B - 6 : https://www.acmicpc.net/problem/10953" {
        val given = """
            5
            1,1
            2,3
            3,4
            9,8
            5,2
        """.trimIndent()
        val expected = """
            2
            5
            7
            17
            7
        """.trimIndent()

        No10953().solve(given.reader().buffered()) shouldBe expected
    }
})
