package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10931Test : StringSpec({
    "SHA-384 : https://www.acmicpc.net/problem/10931" {
        val given = "Baekjoon"
        val expected = "8f077fa785396c86c7f9b8ba03fc41e9ac250a0a3884a2ef5c70638e1a153407b52a58b897a89a0361f2c60c2dc123be"

        No10931.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
