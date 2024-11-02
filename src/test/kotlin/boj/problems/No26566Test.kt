package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No26566Test : StringSpec({
    "Pizza : https://www.acmicpc.net/problem/26566" {
        val given = """
            3
            8 4
            7 9
            9 2
            4 7
            841 108
            8 606
        """.trimIndent()
        val expected = """
            Whole pizza
            Whole pizza
            Slice of pizza
        """.trimIndent()

        No26566().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
