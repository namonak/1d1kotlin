package boj.problems.step5

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11718Test : StringSpec({
    "그대로 출력하기 : https://www.acmicpc.net/problem/11718" {
        // given
        val given = """
            Hello
            Baekjoon
            Online Judge
        """.trimIndent()
        val expected = """
            Hello
            Baekjoon
            Online Judge
        """.trimIndent()

        // when, then
        No11718.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
