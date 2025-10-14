package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5337Test : StringSpec({
    "웰컴 : https://www.acmicpc.net/problem/5337" {
        val expected = """
            .  .   .
            |  | _ | _. _ ._ _  _
            |/\|(/.|(_.(_)[ | )(/.
        """.trimIndent()

        No5337().solve() shouldBe expected
    }
})
