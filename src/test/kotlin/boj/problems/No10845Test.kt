package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10845Test : StringSpec({
    "큐 : https://www.acmicpc.net/problem/10845" {
        val given = """
            15
            push 1
            push 2
            front
            back
            size
            empty
            pop
            pop
            pop
            size
            empty
            pop
            push 3
            empty
            front
        """.trimIndent()
        val expected = """
            1
            2
            2
            0
            1
            2
            -1
            0
            1
            -1
            0
            3
        """.trimIndent()

        No10845().solve(given.reader().buffered()) shouldBe expected
    }
})
