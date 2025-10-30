package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11319Test : StringSpec({
    "Count Me In : https://www.acmicpc.net/problem/11319" {
        val given = """
            3
            You can win this thing
            May be too optimistic
            Just try to have fun
        """.trimIndent()
        val expected = """
            12 6
            10 8
            11 5
        """.trimIndent()

        val actual = No11319().solve(given.reader().buffered())
        actual shouldBe expected
    }
})
