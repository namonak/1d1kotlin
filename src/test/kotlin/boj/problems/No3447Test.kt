package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3447Test : StringSpec({
    "버그왕 : https://www.acmicpc.net/problem/3447" {
        val given = """
            print "No bugs here..."

            void hello() {
            BUGBUG
            printfBUG("Hello, world!\n");
            }

            wriBUGBUGtelBUGn("Hello B-U-G");
        """.trimIndent()
        val expected = """
            print "No bugs here..."

            void hello() {

            printf("Hello, world!\n");
            }

            writeln("Hello B-U-G");
        """.trimIndent()

        No3447().solve(given.reader().buffered()) shouldBe expected
    }
})
