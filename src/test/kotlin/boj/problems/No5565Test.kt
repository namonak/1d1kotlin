package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5565Test : StringSpec({
    "영수증 : https://www.acmicpc.net/problem/5565" {
        val given = """
            9850
            1050
            800
            420
            380
            600
            820
            2400
            1800
            980
        """.trimIndent()
        val expected = 600

        val actual = No5565().solve(given.reader().buffered())

        actual shouldBe expected
    }
})
