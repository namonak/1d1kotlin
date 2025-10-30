package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13411Test : StringSpec({
    "하늘에서 정의가 빗발친다! : https://www.acmicpc.net/problem/13411" {
        val given = """
            4
            3 3 1
            -3 2 3
            -3 -3 1
            4 -4 4
        """.trimIndent()
        val expected = """
            2
            4
            1
            3
        """.trimIndent()

        val result = No13411().solve(given.reader().buffered())
        result shouldBe expected
    }
})
