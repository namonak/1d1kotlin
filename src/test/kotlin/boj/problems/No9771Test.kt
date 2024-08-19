package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9771Test : StringSpec({
    "Word Searching : https://www.acmicpc.net/problem/9771" {
        val given = """
            word
            Write a program to count the occurrences
            of a particular word in a given text
            i.e. how many times does a particular
            word appear in a text? This Word is not counted
            but wording is counted.
        """.trimIndent()
        val expected = "3"

        No9771().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
