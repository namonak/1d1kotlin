package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1159Test : StringSpec({
    "농구 경기 : https://www.acmicpc.net/problem/1159" {
        val testCases = listOf(
            """
                18
                babic
                keksic
                boric
                bukic
                sarmic
                balic
                kruzic
                hrenovkic
                beslic
                boksic
                krafnic
                pecivic
                klavirkovic
                kukumaric
                sunkic
                kolacic
                kovacic
                prijestolonasljednikovi
            """.trimIndent() to "bk",
            """
                6
                michael
                jordan
                lebron
                james
                kobe
                bryant
            """.trimIndent() to "PREDAJA"
        )

        testCases.forEach { (given, expected) ->
            No1159().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
