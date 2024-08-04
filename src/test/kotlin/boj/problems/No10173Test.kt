package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10173Test : StringSpec({
    "니모를 찾아서 : https://www.acmicpc.net/problem/10173" {
        val given = """
            Marlin names this last egg Nemo, a name that Coral liked.
            While attempting to save nemo, Marlin meets Dory,
            a good-hearted and optimistic regal blue tang with short-term memory loss. 
            Upon leaving the East Australian Current,(888*%${'$'}^&%0928375)Marlin and Dory
            NEMO leaves for school and Marlin watches NeMo swim away.
            EOI
        """.trimIndent()
        val expected = """
            Found
            Found
            Missing
            Missing
            Found
        """.trimIndent()

        No10173().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
