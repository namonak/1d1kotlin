package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10809Test : StringSpec({
    "알파벳 찾기 : https://www.acmicpc.net/problem/10809" {
        val given = "baekjoon"
        val expected = "1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1"

        No10809.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
