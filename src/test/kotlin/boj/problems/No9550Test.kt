package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9550Test : StringSpec({
    "아이들은 사탕을 좋아해 : https://www.acmicpc.net/problem/9550" {
        val given = """
            2
            3 2
            4 5 7
            3 8
            4 5 7
        """.trimIndent()
        val expected = """
            7
            0
        """.trimIndent()

        No9550().solve(given.reader().buffered()) shouldBe expected
    }
})
