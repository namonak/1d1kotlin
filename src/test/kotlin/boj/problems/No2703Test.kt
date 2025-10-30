package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2703Test : StringSpec({
    "Cryptoquote : https://www.acmicpc.net/problem/2703" {
        val given = """
            2
            HPC PJVYMIY
            BLMRGJIASOPZEFDCKWYHUNXQTV
            FDY GAI BG UKMY
            KIMHOTSQYRLCUZPAGWJNBVDXEF
        """.trimIndent()
        val expected = """
            ACM CONTEST
            THE SKY IS BLUE
        """.trimIndent()

        No2703().solve(given.reader().buffered()) shouldBe expected
    }
})
