package boj.problems.step14

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No7785Test : StringSpec({
    "회사에 있는 사람 : https://www.acmicpc.net/problem/7785" {
        val no7785 = No7785(InputProcessor(), OutputProcessor())

        val input = """
            4
            Baha enter
            Askar enter
            Baha leave
            Artem enter
        """.trimIndent()

        val actual = no7785.solve(BufferedReader(input.reader()))
        val expected = "Askar\nArtem"

        actual shouldBe expected
    }
})
