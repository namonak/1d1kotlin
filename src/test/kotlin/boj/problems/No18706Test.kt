package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No18706Test : StringSpec({
    "Coffee : https://www.acmicpc.net/problem/18706" {
        val given = """
            1
            3 3
            cappuccino 28 34 41
            latte 25 31 38
            flatwhite 26 33 47
            Mohammed medium cappuccino
            Mostafa large latte
            Ahmad small flatwhite
        """.trimIndent()
        val expected = """
            Mohammed 67
            Mostafa 70
            Ahmad 60
        """.trimIndent()

        No18706().solve(given.reader().buffered()) shouldBe expected
    }
})
