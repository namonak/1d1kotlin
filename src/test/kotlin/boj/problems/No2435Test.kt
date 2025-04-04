package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2435Test : StringSpec({
    "기상청 인턴 신현수 : https://www.acmicpc.net/problem/2435" {
        val given = """
            10 2
            3 -2 -4 -9 0 3 7 13 8 -3
        """.trimIndent()
        val expected = "21"

        No2435().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
