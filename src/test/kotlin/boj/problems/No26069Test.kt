package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26069Test : StringSpec({
    "붙임성 좋은 총총이 : https://www.acmicpc.net/problem/26069" {
        val given = """
            12
            bnb2011 chansol
            chansol chogahui05
            chogahui05 jthis
            jthis ChongChong
            jthis jyheo98
            jyheo98 lms0806
            lms0806 pichulia
            pichulia pjshwa
            pjshwa r4pidstart
            r4pidstart swoon
            swoon tony9402
            tony9402 bnb2011
        """.trimIndent()
        val expected = "10"

        No26069().solve(given.reader().buffered()) shouldBe expected
    }
})
