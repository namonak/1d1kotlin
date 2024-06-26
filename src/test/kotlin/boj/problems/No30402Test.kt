package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30402Test : StringSpec({
    "감마선을 맞은 컴퓨터 : https://www.acmicpc.net/problem/30402" {
        val given = """
            p o o y r y p o y r p r r o p
            y w w y w r w y w p w w w r y
            r w y r w r w w w y r p w w o
            r p w w w w w y w w o w o r w
            y w w w r o p w o r r w p p w
            y y w w w o w p o w r p p o o
            p w p w p y o p w w w w p y w
            y w y o w o w o o o w o w w p
            y o w w y w w w r w o p w w p
            p w p y w w o w o r w w p r y
            p p w w w w y r w w w y y o w
            p w p w w w w o o p o w p w p
            y p o y w p w w w w w w r w p
            p y r w w w w w o w w p o y w
            o r w w y y y w w o o y y r w
        """.trimIndent()
        val expected = "chunbae"

        No30402().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
