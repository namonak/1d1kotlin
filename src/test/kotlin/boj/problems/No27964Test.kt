package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No27964Test : StringSpec({
    "콰트로치즈피자 : https://www.acmicpc.net/problem/27964" {
        val testCases = listOf(
            """
                4
                CheddarCheese MozzarellaCheese GoudaCheese GranaPadanoCheese
            """.trimIndent() to "yummy",
            """
                4
                MozzarellaCheese MozzarellaCheese MozzarellaCheese MozzarellaCheese
            """.trimIndent() to "sad",
            """
                4
                CheeseBurger CheeseBall CheeseCake CheeseRavioli
            """.trimIndent() to "sad",
            """
                7
                C Chess cheese Cheesa Cheesz Cheesp Cheese
            """.trimIndent() to "sad"
        )

        testCases.forEach { (given, expected) ->
            No27964().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
