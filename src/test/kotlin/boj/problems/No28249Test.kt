package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

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

        val actual = No28249().solve(given.reader().buffered())
        actual shouldBe expected
    }
})
