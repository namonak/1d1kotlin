package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5361Test : StringSpec({
    "전투 드로이드 가격 : https://www.acmicpc.net/problem/5361" {
        val given = """
            3
            20 10 14 3 9
            19 17 12 8 10
            11 9 8 22 33
        """.trimIndent()
        val expected = """
            ${'$'}13987.50
            ${'$'}15679.76
            ${'$'}16182.54
        """.trimIndent()

        No5361().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
