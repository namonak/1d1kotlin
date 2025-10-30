package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11944Test : StringSpec({
    "NN : https://www.acmicpc.net/problem/11944" {
        val given = "20 16"
        val expected = "2020202020202020"

        No11944().solve(given.reader().buffered()) shouldBe expected
    }
})
