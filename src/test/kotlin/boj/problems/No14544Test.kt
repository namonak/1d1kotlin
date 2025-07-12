package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No14544Test : StringSpec({
    "Vote : https://www.acmicpc.net/problem/14544" {
        val given = """
            2
            3 4
            Bignon
            Akwaba
            Sessi
            Bignon 1000 Gbegamey
            Sessi 1000 Yenawa
            Akwaba 5 Vodje
            Akwaba 996 Yenawa
            2 3
            Sena
            Sedjro
            Sedjro 6003 Malanville
            Sena 6000 Kpankpan
            Sena 3 Godomey
        """.trimIndent()
        val expected = """
            VOTE 1: THE WINNER IS Akwaba 1001
            VOTE 2: THERE IS A DILEMMA
        """.trimIndent()

        val result = No14544().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})
