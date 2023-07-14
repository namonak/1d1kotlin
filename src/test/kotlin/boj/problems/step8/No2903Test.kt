package boj.problems.step8

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2903Test : StringSpec({
    "중앙 이동 알고리즘 : https://www.acmicpc.net/problem/2903" {
        val testCases = listOf(
            1 to 9,
            2 to 25,
            3 to 81,
            4 to 289,
            5 to 1089,
            6 to 4225,
            7 to 16641,
            8 to 66049,
            9 to 263169,
            10 to 1050625,
            11 to 4198401,
            12 to 16785409,
            13 to 67125249,
            14 to 268468225,
            15 to 1073807361
        )

        testCases.forEach { (given, expected) ->
            val actual = No2903.solve(given)

            actual shouldBe expected
        }
    }
})
