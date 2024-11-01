package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No16205Test : StringSpec({
    "변수명 : https://www.acmicpc.net/problem/16205" {
        val testCases = listOf(
            "2 variable_n" to """
                variableN
                variable_n
                VariableN
            """.trimIndent(),
            "1 camelCase" to """
                camelCase
                camel_case
                CamelCase
            """.trimIndent(),
            "3 HowToSolveThisProblem" to """
                howToSolveThisProblem
                how_to_solve_this_problem
                HowToSolveThisProblem
            """.trimIndent(),
            "2 good" to """
                good
                good
                Good
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No16205().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
