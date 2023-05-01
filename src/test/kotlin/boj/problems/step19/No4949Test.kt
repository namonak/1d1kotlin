package boj.problems.step19

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class No4949Test : StringSpec({
    "균형잡힌 세상 테스트" {
        println("균형잡힌 세상 : https://www.acmicpc.net/problem/4949")

        // Define the test cases as a Table
        val testCases = listOf(
            row("So when I die (the [first] I will see in (heaven) is a score list).", "yes"),
            row("[ first in ] ( first out ).", "yes"),
            row("Half Moon tonight (At least it is better than no Moon at all].", "no"),
            row("A rope may form )( a trail in a maze.", "no"),
            row("Help( I[m being held prisoner in a fortune cookie factory)].", "no"),
            row("([ (([( [ ] ) ( ) (( ))] )) ]).", "yes"),
            row(" .", "yes"),
            row(". .", "yes"),
        )

        testCases.forEach { (input, expected) ->
            // Run the test
            val actual = No4949.solve(input)

            // Verify the result
            actual shouldBe expected
        }
    }
})
