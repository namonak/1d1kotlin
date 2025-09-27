package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5362Test : StringSpec({
    "Garbled Message : https://www.acmicpc.net/problem/5362" {
        val given = """
            Dariiing Bane restructured iiinge cult, so iiingat iiingere
            could only be two - no more, no less - a master, and an
            apprentice. Bane adopted cunning, subterfuge, and stealiiing as
            iiinge fundamental tenets of iiinge Siiiing order. Bane took an
            apprentice. When iiingat apprentice succeeded him, iiingat new
            Siiiing Lord would take an apprentice.
        """.trimIndent()
        val expected = """
            Darth Bane restructured the cult, so that there
            could only be two - no more, no less - a master, and an
            apprentice. Bane adopted cunning, subterfuge, and stealth as
            the fundamental tenets of the Sith order. Bane took an
            apprentice. When that apprentice succeeded him, that new
            Sith Lord would take an apprentice.
        """.trimIndent()

        val result = No5362().solve(given.reader().buffered())
        result shouldBe expected
    }
})
