package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10928Test : StringSpec({
    "SHA-1 : https://www.acmicpc.net/problem/10928" {
        val given = "Baekjoon"
        val expected = "a25cdb0b8ead2861a3ef2c48cdc15517994ab278"

        No10928.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
