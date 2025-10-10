package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10932Test : StringSpec({
    "SHA-512 : https://www.acmicpc.net/problem/10932" {
        val given = "Baekjoon"
        No10932.solve(given) shouldBe
            "40529e337a46dadc9473d7ed1b16c74868c996d79573c75784e6da37a51394abecfe26414e5097873c31de0dae0b1ef5dab7718d46aa629da3a72c80a0eeeef2"
    }
})
