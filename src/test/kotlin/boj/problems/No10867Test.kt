package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10867Test : StringSpec({
    "중복 빼고 정렬하기 : https://www.acmicpc.net/problem/10867" {
        val given = """
            10
            1 4 2 3 1 4 2 3 1 2
        """.trimIndent()
        val expected = "1 2 3 4"

        No10867().solve(given.reader().buffered()) shouldBe expected
    }
})
