package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4084Test : StringSpec({
    "Viva la Diferencia : https://www.acmicpc.net/problem/4084" {
        val given = """
            1 3 5 9
            4 3 2 1
            1 1 1 1
            0 0 0 0
        """.trimIndent()
        val expected = """
            6
            4
            0
        """.trimIndent()

        val result = No4084().solve(given.reader().buffered())
        result shouldBe expected
    }
})
