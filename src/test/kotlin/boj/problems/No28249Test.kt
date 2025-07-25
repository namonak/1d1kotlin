package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No28249Test : StringSpec({
    "Chili Peppers : https://www.acmicpc.net/problem/28249" {
        val given = """
            4
            Poblano
            Cayenne
            Thai
            Poblano
        """.trimIndent()
        val expected = "118000"

        val actual = No28249().solve(BufferedReader(given.reader()))
        actual shouldBe expected
    }
})
