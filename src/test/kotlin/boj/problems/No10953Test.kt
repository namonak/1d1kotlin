package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

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

        val actual = No10953.solve(BufferedReader(given.reader()))

        actual shouldBe expected
    }
})
