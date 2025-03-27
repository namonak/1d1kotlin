package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No4714Test : StringSpec({
    "Lunacy : https://www.acmicpc.net/problem/4714" {
        val given = """
            100.0
            12.0
            0.12
            120000.0
            -1.0
        """.trimIndent()
        val expected = """
            Objects weighing 100.00 on Earth will weigh 16.70 on the moon.
            Objects weighing 12.00 on Earth will weigh 2.00 on the moon.
            Objects weighing 0.12 on Earth will weigh 0.02 on the moon.
            Objects weighing 120000.00 on Earth will weigh 20040.00 on the moon.
        """.trimIndent()

        No4714().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
