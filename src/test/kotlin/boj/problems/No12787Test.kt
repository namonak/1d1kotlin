package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No12787Test : StringSpec({
    "지금 밥이 문제냐 : https://www.acmicpc.net/problem/12787" {
        val given = """
            3
            1 70.236.217.197.157.238.150.80
            2 5110699119940114000
            2 0
        """.trimIndent()
        val expected = """
            5110699119940114000
            70.236.217.197.157.238.150.80
            0.0.0.0.0.0.0.0
        """.trimIndent()

        val result = No12787().solve(given.reader().buffered())
        result shouldBe expected
    }
})
