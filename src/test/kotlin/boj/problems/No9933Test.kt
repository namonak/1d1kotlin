package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No9933Test : StringSpec({
    "민균이의 비밀번호 : https://www.acmicpc.net/problem/9933" {
        val testCases = listOf(
            """
                4
                las
                god
                psala
                sal
            """.trimIndent() to "3 a",
            """
                4
                kisik
                ptq
                tttrp
                tulipan
            """.trimIndent() to "5 s"
        )

        testCases.forEach { (given, expected) ->
            No9933().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
