package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1967Test : StringSpec({
    val testCases = listOf(
        """
            12
            1 2 3
            1 3 2
            2 4 5
            3 5 11
            3 6 9
            4 7 1
            4 8 7
            5 9 15
            5 10 4
            6 11 6
            6 12 10
        """.trimIndent() to "45",
        """
            1
        """.trimIndent() to "0",
        """
            5
            1 2 10
            1 3 20
            1 4 30
            1 5 40
        """.trimIndent() to "70",
        """
            7
            1 2 1
            1 3 1
            2 4 100
            2 5 100
            3 6 1
            3 7 1
        """.trimIndent() to "200"
    )

    testCases.forEach { (given, expected) ->
        No1967().solve(given.reader().buffered()) shouldBe expected
    }
})
