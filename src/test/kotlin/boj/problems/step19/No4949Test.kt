package boj.problems.step19

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No4949Test : StringSpec({
    "균형잡힌 세상 테스트 : https://www.acmicpc.net/problem/4949" {
        val given = """
            So when I die (the [first] I will see in (heaven) is a score list).
            [ first in ] ( first out ).
            Half Moon tonight (At least it is better than no Moon at all].
            A rope may form )( a trail in a maze.
            Help( I[m being held prisoner in a fortune cookie factory)].
            ([ (([( [ ] ) ( ) (( ))] )) ]).
             .
            .
        """.trimIndent()
        val expected = """
            yes
            yes
            no
            no
            no
            yes
            yes
        """.trimIndent()

        No4949().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
