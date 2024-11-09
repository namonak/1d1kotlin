package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11328Test : StringSpec({
    "Strfry : https://www.acmicpc.net/problem/11328" {
        val given = """
            4
            a a
            ab ba
            ring gnir
            newt twan
        """.trimIndent()
        val expected = """
            Possible
            Possible
            Possible
            Impossible
        """.trimIndent()

        No11328().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
