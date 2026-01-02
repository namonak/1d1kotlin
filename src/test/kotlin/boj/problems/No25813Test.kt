package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25813Test : StringSpec({
    "Changing Strings : https://www.acmicpc.net/problem/25813" {
        val testCases = listOf(
            "ABUDEGHFXYZ" to "--UCCCCF---",
            "CCUZF" to "--UCF",
            "ABFABCUABABFABUABFABUAB" to "------UCCCCCCCCCCF-----",
            "UABCFABCDE" to "UCCCF-----"
        )

        for ((given, expected) in testCases) {
            No25813().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
