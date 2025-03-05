package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5692Test : StringSpec({
    "팩토리얼 진법 : https://www.acmicpc.net/problem/5692" {
        val given = """
            719
            1
            15
            110
            102
            0
        """.trimIndent()
        val expected = """
            53
            1
            7
            8
            8
        """.trimIndent()

        No5692().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
