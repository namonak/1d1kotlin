package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10939Test : StringSpec({
    "BASE32 디코딩 : https://www.acmicpc.net/problem/10939" {
        val given = "IJQWK23KN5XW4==="
        val expected = "Baekjoon"

        No10939().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
