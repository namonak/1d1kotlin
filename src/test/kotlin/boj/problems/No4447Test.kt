package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4447Test : StringSpec({
    "좋은놈 나쁜놈 : https://www.acmicpc.net/problem/4447" {
        val given = """
            8
            Algorithm Crunching Man
            Green Lantern
            Boba Fett
            Superman
            Batman
            Green Goblin
            Barney
            Spider Pig
        """.trimIndent()
        val expected = """
            Algorithm Crunching Man is GOOD
            Green Lantern is GOOD
            Boba Fett is A BADDY
            Superman is NEUTRAL
            Batman is A BADDY
            Green Goblin is GOOD
            Barney is A BADDY
            Spider Pig is GOOD
        """.trimIndent()

        No4447().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
