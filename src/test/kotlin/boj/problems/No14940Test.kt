package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No14940Test : StringSpec({
    "쉬운 최단거리 : https://www.acmicpc.net/problem/14940" {
        val given = """
            15 15
            2 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 0 0 0 0 1
            1 1 1 1 1 1 1 1 1 1 0 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 0 1 0 0 0
            1 1 1 1 1 1 1 1 1 1 0 1 1 1 1
        """.trimIndent()
        val expected = """
            0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
            1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
            2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
            3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
            4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
            5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
            6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
            7 8 9 10 11 12 13 14 15 16 17 18 19 20 21
            8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
            9 10 11 12 13 14 15 16 17 18 19 20 21 22 23
            10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
            11 12 13 14 15 16 17 18 19 20 0 0 0 0 25
            12 13 14 15 16 17 18 19 20 21 0 29 28 27 26
            13 14 15 16 17 18 19 20 21 22 0 30 0 0 0
            14 15 16 17 18 19 20 21 22 23 0 31 32 33 34
        """.trimIndent()

        No14940().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
