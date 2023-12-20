package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4470Test : StringSpec({
    "줄번호 : https://www.acmicpc.net/problem/4470" {
        val given = """
            5
            Lionel Cosgrove
            Alice
            Columbus and Tallahassee
            Shaun and Ed
            Fido
        """.trimIndent()
        val expected = """
            1. Lionel Cosgrove
            2. Alice
            3. Columbus and Tallahassee
            4. Shaun and Ed
            5. Fido
        """.trimIndent()

        No4470.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
