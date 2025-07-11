package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No29847Test : StringSpec({
    "Character Frequencies : https://www.acmicpc.net/problem/29847" {
        val given = """
            4
            A printing press is a mechanical device
            for applying pressure to an inked surface
            resting upon a print medium (such as paper
            or cloth), thereby transferring the ink.
        """.trimIndent()
        val expected = """
            ( 1
            ) 1
            , 1
            . 1
            A 1
            a 10
            b 1
            c 6
            d 3
            e 15
            f 3
            g 4
            h 5
            i 12
            k 2
            l 3
            m 3
            n 12
            o 5
            p 9
            r 14
            s 10
            t 8
            u 5
            v 1
            y 2
        """.trimIndent()

        val result = No29847().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})
