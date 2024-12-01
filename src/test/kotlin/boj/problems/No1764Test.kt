package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1764Test : StringSpec({
    "듣보잡 : https://www.acmicpc.net/problem/1764" {
        val given = """
            3 4
            ohhenrie
            charlie
            baesangwook
            obama
            baesangwook
            ohhenrie
            clinton
        """.trimIndent()
        val expected = """
            2
            baesangwook
            ohhenrie
        """.trimIndent()

        No1764().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
