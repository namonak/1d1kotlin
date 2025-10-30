package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5363Test : StringSpec({
    "요다 : https://www.acmicpc.net/problem/5363" {
        val given = """
            4
            I will go now to find the Wookiee
            Solo found the death star near planet Kessel
            I'll fight Darth Maul here and now
            Vader will find Luke before he can escape
        """.trimIndent()
        val expected = """
            go now to find the Wookiee I will
            the death star near planet Kessel Solo found
            Darth Maul here and now I'll fight
            find Luke before he can escape Vader will
        """.trimIndent()

        No5363().solve(given.reader().buffered()) shouldBe expected
    }
})
