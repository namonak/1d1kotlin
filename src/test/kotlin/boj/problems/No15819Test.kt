package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15819Test : StringSpec({
    "너의 핸들은 : https://www.acmicpc.net/problem/15819" {
        val testCases = listOf(
            """
                4 1
                acka1357
                spectaclehong
                mitslll
                luke0201
            """.trimIndent() to "acka1357",
            """
                9 7
                tourist
                petr
                qilip
                won0114
                hmy3743
                jujh97
                hjhj97
                bio8641
                kangjieun9843
            """.trimIndent() to "qilip"
        )

        testCases.forEach { (given, expected) ->
            No15819().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
