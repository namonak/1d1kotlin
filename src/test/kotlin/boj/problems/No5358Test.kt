package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5358Test : StringSpec({
    "Football Team : https://www.acmicpc.net/problem/5358" {
        val given = """
            Alan Pagi
            John Hiesman
            Justen Forsitt
            Phel Semms
            Tem Tibow
            Marshawn Lynch
            Lion Washengton
        """.trimIndent()
        val expected = """
            Alan Page
            John Heisman
            Justin Forsett
            Phil Simms
            Tim Tebow
            Marshawn Lynch
            Leon Washington
        """.trimIndent()

        No5358().solve(given.reader().buffered()) shouldBe expected
    }
})
