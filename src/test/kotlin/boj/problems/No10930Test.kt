package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10930Test : StringSpec({
    "SHA-256 : https://www.acmicpc.net/problem/10930" {
        val given = "Baekjoon"
        val expected = "9944e1862efbb2a4e2486392dc6701896416b251eccdecb8332deb7f4cf2a857"

        No10930().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
