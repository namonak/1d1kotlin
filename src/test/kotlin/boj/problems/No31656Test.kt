package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No31656Test : StringSpec({
    "Sticky Keys : https://www.acmicpc.net/problem/31656" {
        val testCases = listOf(
            "UAAAAAPC" to "UAPC",
            "UUAAPPCCC is my 11th faavvorite conNtEest" to "UAPC is my 1th favorite conNtEest"
        )

        testCases.forEach { (given, expected) ->
            No31656().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
