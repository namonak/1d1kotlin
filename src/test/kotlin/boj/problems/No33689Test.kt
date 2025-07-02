package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No33689Test : StringSpec({
    "CPDU : https://www.acmicpc.net/problem/33689" {
        val given = """
            6
            UDPC
            CPDU
            YUNEE
            DALGOO
            PONIX
            CONTEST
        """.trimIndent()
        val expected = "2"

        val actual = No33689().solve(BufferedReader(given.reader()))
        actual shouldBe expected
    }
})
