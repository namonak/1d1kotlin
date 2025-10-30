package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2669Test : StringSpec({
    "직사각형 네개의 합집합의 면적 구하기 : https://www.acmicpc.net/problem/2669" {
        val given = """
            1 2 4 4
            2 3 5 7
            3 1 6 5
            7 3 8 6
        """.trimIndent()
        val expected = "26"

        No2669().solve(given.reader().buffered()) shouldBe expected
    }
})
