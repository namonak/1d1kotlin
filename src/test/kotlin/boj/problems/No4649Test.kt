package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4649Test : StringSpec({
    "Tanning Salon : https://www.acmicpc.net/problem/4649" {
        val given = """
            2 ABBAJJKZKZ
            3 GACCBDDBAGEE
            3 GACCBGDDBAEE
            1 ABCBCA
            0
        """.trimIndent()
        val expected = """
            All customers tanned successfully.
            1 customer(s) walked away.
            All customers tanned successfully.
            2 customer(s) walked away.
        """.trimIndent()

        val actual = No4649().solve(given.reader().buffered())
        actual shouldBe expected
    }
})
