package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No32778Test : StringSpec({
    "가희와 부역명 : https://www.acmicpc.net/problem/32778" {
        val testCases = listOf(
            "palindrome (yeokgok yeokcheon yeoksam)" to """
                palindrome
                yeokgok yeokcheon yeoksam
            """.trimIndent(),
            "ori" to """
                ori
                -
            """.trimIndent(),
            "AfterSchool (Flask-back)" to """
                AfterSchool
                Flask-back
            """.trimIndent(),
            "Infinity (girls next door)" to """
                Infinity
                girls next door
            """.trimIndent(),
            "Soongsil Univ (Salpijae)" to """
                Soongsil Univ
                Salpijae
            """.trimIndent(),
            "dotori (not Tottori)" to """
                dotori
                not Tottori
            """.trimIndent(),
            "mmmn (mMmN)" to """
                mmmn
                mMmN
            """.trimIndent(),
            "Its dream dream dream dream dream dream world" to """
                Its dream dream dream dream dream dream world
                -
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No32778().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
