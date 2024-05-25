package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10927Test : StringSpec({
    "MD5 : https://www.acmicpc.net/problem/10927" {
        val given = "Baekjoon"
        val expected = "91bebba139b8b8aee0d8e80e27f473a3"

        No10927().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
