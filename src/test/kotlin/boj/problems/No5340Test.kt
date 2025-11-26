package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5340Test : StringSpec({
    "Secret Location : https://www.acmicpc.net/problem/5340" {
        val given = """
            This is a simple message.
            Each line of the input,
            represents some positive integer.
            The first 
            three lines are for latitude and
            the last three lines are for longitude.
        """.trimIndent()
        val expected = """
            Latitude 25:23:33
            Longitude 9:32:39
        """.trimIndent()

        No5340().solve(given.reader().buffered()) shouldBe expected
    }
})
