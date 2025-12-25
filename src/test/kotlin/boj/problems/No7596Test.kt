package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No7596Test : StringSpec({
    "MP3 Songs : https://www.acmicpc.net/problem/7596" {
        val given = """
            10
            Forever
            Take A Bow
            Always On My Mind
            Lollipop
            Love In This Club
            No Air
            Sweet About Me
            Party People
            Mercy
            American Boy
            8
            Partita
            Air on a 'G' string
            Sinfonia in D
            Jesu, joy of man's desiring 
            Arioso
            Violin Concerto in A Minor
            Brandenburg Concerto 2
            Concerto for 2 violins
            0
        """.trimIndent()
        val expected = """
            1
            Always On My Mind
            American Boy
            Forever
            Lollipop
            Love In This Club
            Mercy
            No Air
            Party People
            Sweet About Me
            Take A Bow
            2
            Air on a 'G' string
            Arioso
            Brandenburg Concerto 2
            Concerto for 2 violins
            Jesu, joy of man's desiring 
            Partita
            Sinfonia in D
            Violin Concerto in A Minor
        """.trimIndent()

        No7596().solve(given.reader().buffered()) shouldBe expected
    }
})
