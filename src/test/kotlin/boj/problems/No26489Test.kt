package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No26489Test : StringSpec({
    "Gum Gum for Jay Jay : https://www.acmicpc.net/problem/26489" {
        val given = """
            gum gum for jay jay
            gum gum for jay jay
            gum gum for jay jay
            gum gum for jay jay
            gum gum for jay jay
            gum gum for jay jay
            gum gum for jay jay
            gum gum for jay jay
            gum gum for jay jay
            gum gum for jay jay
            gum gum for jay jay
        """.trimIndent()
        val expected = "11"

        No26489().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
