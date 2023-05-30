package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2941Test : StringSpec({
    "크로아티아 알파벳 : https://www.acmicpc.net/problem/2941" {
        // given
        val testCases = listOf(
            "ljes=njak" to 6,
            "ddz=z=" to 3,
            "nljj" to 3,
            "c=c=" to 2,
            "dz=ak" to 3
        )

        testCases.forEach { (given, expected) ->
            val actual = No2941.solve(given)

            actual shouldBe expected
        }
    }
})
