package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No18766Test : StringSpec({
    "카드 바꿔치기 : https://www.acmicpc.net/problem/18766" {
        val given = """
            4
            5
            R0 B9 R5 Y3 R2
            R0 B8 R6 Y3 R2
            1
            R0
            R0
            3
            R1 R0 R0
            R0 R1 R1
            3
            R1 R1 R0
            R0 R1 R1
        """.trimIndent()
        val expected = """
            CHEATER
            NOT CHEATER
            CHEATER
            NOT CHEATER
        """.trimIndent()

        val actual = No18766().solve(given.reader().buffered())
        actual shouldBe expected
    }
})
