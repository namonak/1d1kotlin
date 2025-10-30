package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26560Test : StringSpec({
    "Periods : https://www.acmicpc.net/problem/26560" {
        val given = """
            3
            You kicked my dog
            No I did not.
            It was the kid that did
        """.trimIndent()
        val expected = """
            You kicked my dog.
            No I did not.
            It was the kid that did.
        """.trimIndent()

        No26560().solve(given.reader().buffered()) shouldBe expected
    }
})
