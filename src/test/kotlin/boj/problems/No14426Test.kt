package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14426Test : StringSpec({
    "접두사 찾기 : https://www.acmicpc.net/problem/14426" {
        val given = """
            5 10
            baekjoononlinejudge
            startlink
            codeplus
            sundaycoding
            codingsh
            baekjoon
            star
            start
            code
            sunday
            coding
            cod
            online
            judge
            plus
        """.trimIndent()
        val expected = "7"

        val result = No14426().solve(given.reader().buffered())
        result shouldBe expected
    }
})
