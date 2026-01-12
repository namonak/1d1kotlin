package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26530Test : StringSpec({
    "Shipping : https://www.acmicpc.net/problem/26530" {
        val given = """
            2
            3
            Eggs 12 0.75
            Milk 1 2.00
            Feathers 50 .02
            2
            Cow 1 100.00
            Cheese 3 0.54
        """.trimIndent()
        val expected = """
            $12.00
            $101.62
        """.trimIndent()

        No26530().solve(given.reader().buffered()) shouldBe expected
    }
})
