package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No7785Test : StringSpec({
    "회사에 있는 사람 : https://www.acmicpc.net/problem/7785" {
        val input = """
            4
            Baha enter
            Askar enter
            Baha leave
            Artem enter
        """.trimIndent()
        val expected = """
            Askar
            Artem
        """.trimIndent()

        No7785().solve(input.reader().buffered()) shouldBe expected
    }
})
