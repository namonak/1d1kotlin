package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4458Test : StringSpec({
    "첫 글자를 대문자로 : https://www.acmicpc.net/problem/4458" {
        val given = """
            5
            powdered Toast Man
            skeletor
            Electra Woman and Dyna Girl
            she-Ra Princess of Power
            darth Vader
        """.trimIndent()
        val expected = """
            Powdered Toast Man
            Skeletor
            Electra Woman and Dyna Girl
            She-Ra Princess of Power
            Darth Vader
        """.trimIndent()

        No4458.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
