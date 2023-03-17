package boj.problems.step24

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1920Test : StringSpec({
    "수 찾기 : https://www.acmicpc.net/problem/1920" {
        val no1920 = No1920(InputProcessor(), OutputProcessor())

        val given = """
            5
            4 1 5 2 3
            5
            1 3 7 9 5
        """.trimIndent()

        val actual = no1920.solve(given)
        val expected = "1 1 0 0 1"

        actual shouldBe expected
    }
})
