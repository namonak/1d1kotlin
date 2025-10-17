package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10825Test : StringSpec({
    "국영수 : https://www.acmicpc.net/problem/10825" {
        val given = """
            12
            Junkyu 50 60 100
            Sangkeun 80 60 50
            Sunyoung 80 70 100
            Soong 50 60 90
            Haebin 50 60 100
            Kangsoo 60 80 100
            Donghyuk 80 60 100
            Sei 70 70 70
            Wonseob 70 70 90
            Sanghyun 70 70 80
            nsj 80 80 80
            Taewhan 50 60 90
        """.trimIndent()
        val expected = """
            Donghyuk
            Sangkeun
            Sunyoung
            nsj
            Wonseob
            Sanghyun
            Sei
            Kangsoo
            Haebin
            Junkyu
            Soong
            Taewhan
        """.trimIndent()

        No10825().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
