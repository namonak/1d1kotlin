package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5635Test : StringSpec({
    "생일 : https://www.acmicpc.net/problem/5635" {
        val given = """
            5
            Mickey 1 10 1991
            Alice 30 12 1990
            Tom 15 8 1993
            Jerry 18 9 1990
            Garfield 20 9 1990
        """.trimIndent()
        val expected = "Tom\nJerry"

        No5635.solve(BufferedReader(given.reader())) shouldBe expected
    }
})
