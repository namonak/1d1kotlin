package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25593Test : StringSpec({
    "근무 지옥에 빠진 푸앙이 (Small) : https://www.acmicpc.net/problem/25593" {
        val testCases = listOf(
            """
                4
                - - - - - pangyo puang
                - - - - - sally boss
                - - - - - leonard brown
                - - - - - edward edward
                puang pangyo choco leonard cony leonard choco
                cony edward cony leonard moon puang edward
                choco boss puang brown brown pangyo cony
                choco edward puang cony moon choco boss
                brown moon moon sally pangyo puang choco
                pangyo edward boss sally moon cony pangyo
                brown puang james moon cony choco choco
                sally brown sally puang james moon sally
                leonard pangyo - - - - -
                boss choco - - - - -
                moon edward - - - - -
                moon sally - - - - -
            """.trimIndent() to "No",
            """
                4
                - - - - - sally boss
                - - - - - brown boss
                - - - - - moon sally
                - - - - - leonard edward
                pangyo moon cony boss james sally brown
                moon brown sally cony brown choco edward
                moon leonard pangyo moon edward puang puang
                leonard sally boss choco cony boss edward
                brown sally jessica leonard moon jessica james
                jessica brown leonard puang james pangyo puang
                puang choco james cony jessica pangyo jessica
                pangyo jessica choco james puang cony pangyo
                moon moon james choco edward - -
                jessica brown james sally puang - -
                cony leonard moon boss choco - -
                edward jessica cony brown leonard - -
            """.trimIndent() to "Yes"
        )

        testCases.forEach { (given, expected) ->
            val actual = No25593().solve(given.reader().buffered())
            actual shouldBe expected
        }
    }
})
