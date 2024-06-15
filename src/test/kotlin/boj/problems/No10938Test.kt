package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10938Test : StringSpec({
    "BASE32 인코딩 : https://www.acmicpc.net/problem/10938" {
        val given = "Baekjoon"
        val expected = "IJQWK23KN5XW4==="

        No10938().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
