package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No6013Test : StringSpec({
    "Lonesome Partners : https://www.acmicpc.net/problem/6013" {
        val given = """
            8
            2 6
            3 3
            2 8
            4 5
            7 5
            5 5
            9 1
            5 4
        """.trimIndent()
        val expected = "3 7"

        No6013().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
