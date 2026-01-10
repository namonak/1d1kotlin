package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No7585Test : StringSpec({
    "Brackets : https://www.acmicpc.net/problem/7585" {
        val given = """
            void test(int num) { num = double(num); }
            int count(int value) { return (value + 2; }
            while(sum < 200) { sum += data[test(sum]); }
            #
        """.trimIndent()
        val expected = """
            Legal
            Illegal
            Illegal
        """.trimIndent()

        No7585().solve(given.reader().buffered()) shouldBe expected
    }
})
