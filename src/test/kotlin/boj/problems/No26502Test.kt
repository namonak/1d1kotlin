package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26502Test : StringSpec({
    "Decoder : https://www.acmicpc.net/problem/26502" {
        val given = """
            4
            Wa most fend ynd dastriu Loka
            Skuwylkar, bafira ha bacimas
            ynithar Ibe-Wyn.
            - Kuli Ran
        """.trimIndent()
        val expected = """
            We must find and destroy Luke
            Skywalker, before he becomes
            another Obi-Wan.
            - Kylo Ren
        """.trimIndent()

        No26502().solve(given.reader().buffered()) shouldBe expected
    }
})
