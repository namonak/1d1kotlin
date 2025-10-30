package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20949Test : StringSpec({
    "효정과 새 모니터 : https://www.acmicpc.net/problem/20949" {
        val given = """
            2
            10 10
            20 20
        """.trimIndent()
        val expected = """
            2
            1
        """.trimIndent()

        No20949().solve(given.reader().buffered()) shouldBe expected
    }
})
