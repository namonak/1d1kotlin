package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2744Test : StringSpec({
    "대소문자 바꾸기 : https://www.acmicpc.net/problem/2744" {
        val given = "WrongAnswer"
        val expected = "wRONGaNSWER"

        No2744().solve(given.reader().buffered()) shouldBe expected
    }
})
