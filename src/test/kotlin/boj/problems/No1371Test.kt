package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1371Test : StringSpec({
    "가장 많은 글자 : https://www.acmicpc.net/problem/1371" {
        val testCases = listOf(
            """
                english is a west germanic
                language originating in england
                and is the first language for
                most people in the united
                kingdom the united states
                canada australia new zealand
                ireland and the anglophone
                caribbean it is used
                extensively as a second
                language and as an official
                language throughout the world
                especially in common wealth
                countries and in many
                international organizations
            """.trimIndent()
                to "a",
            """
                baekjoon online judge
            """.trimIndent()
                to "eno",
            """
                abc a
            """.trimIndent()
                to "a",
            """
                abc
                ab
            """.trimIndent()
                to "ab",
            """
                amanda forsaken bloomer meditated gauging knolls
                betas neurons integrative expender commonalities
                latins antidotes crutched bandwidths begetting
                prompting dog association athenians christian ires
                pompousness percolating figured bagatelles bursted
                ninth boyfriends longingly muddlers prudence puns
                groove deliberators charter collectively yorks
                daringly antithesis inaptness aerosol carolinas
                payoffs chumps chirps gentler inexpressive morales
            """.trimIndent()
                to "e"
        )

        testCases.forEach { (given, output) ->
            No1371().solve(given.reader().buffered()) shouldBe output
        }
    }
})
