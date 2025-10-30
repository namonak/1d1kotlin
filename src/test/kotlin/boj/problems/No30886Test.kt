package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class No30886Test : StringSpec({
    "Artistic Souvenir : https://www.acmicpc.net/problem/30886" {
        val testCases = listOf(
            "42" to "86.7269920446",
            "20231125" to "25779373.7414336279"
        )

        testCases.forEach { (given, expectedStr) ->
            // 1) 실제 결과를 문자열로 받고
            val actualStr = No30886().solve(given.reader().buffered())
            // 2) Double로 파싱
            val actual = actualStr.toDouble()
            val expected = expectedStr.toDouble()
            // 3) 절대 오차 1e-9 이내인지 비교
            actual shouldBe (expected plusOrMinus 1e-9)
        }
    }
})
