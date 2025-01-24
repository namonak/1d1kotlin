package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No27891Test : StringSpec({
    "특별한 학교 이름 암호화 : https://www.acmicpc.net/problem/27891" {
        val testCases = listOf(
            "csboltpnfi" to "BHA",
            "noejcinwpm" to "SJA",
            "northlondo" to "NLCS",
            "koreainter" to "KIS"
        )

        testCases.forEach { (given, expected) ->
            No27891().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
