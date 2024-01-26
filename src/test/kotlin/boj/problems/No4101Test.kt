package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4101Test : StringSpec({
    "크냐? : https://www.acmicpc.net/problem/4101" {
        val given = """
            1 19
            4 4
            23 14
            0 0
        """.trimIndent()
        val expected = """
            No
            No
            Yes
        """.trimIndent()

        No4101.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
