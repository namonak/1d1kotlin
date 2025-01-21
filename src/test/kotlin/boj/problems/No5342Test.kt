package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5342Test : StringSpec({
    "Billing : https://www.acmicpc.net/problem/5342" {
        val given = """
            Binders
            Calendar
            Ink
            Notebooks
            Binders
            Ink
            EOI
        """.trimIndent()
        val expected = "\$201.05"

        No5342().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
