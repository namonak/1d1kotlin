package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11943Test : StringSpec({
    "파일 옮기기 : https://www.acmicpc.net/problem/11943" {
        val given = """
            1 2
            3 4
        """.trimIndent()
        val expected = "5"

        No11943().solve(given.reader().buffered()) shouldBe expected
    }
})
