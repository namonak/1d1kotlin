package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No30891Test : StringSpec({
    "볶음밥 지키기 : https://www.acmicpc.net/problem/30891" {
        val given = """
            7 2
            1 1
            -1 1
            3 1
            1 3
            1 -1
            5 1
            5 3
        """.trimIndent()
        val expected = "1 1"

        No30891().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
