package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11365Test : StringSpec({
    "!밀비 급일 : https://www.acmicpc.net/problem/11365" {
        val given = """
            !edoc doog a tahW
            noitacitsufbo
            erafraw enirambus detcirtsernu yraurbeF fo tsrif eht no nigeb ot dnetni eW
            lla sees rodroM fo drol eht ,ssertrof sih nihtiw delaecnoC
            END
        """.trimIndent()
        val expected = """
            What a good code!
            obfustication
            We intend to begin on the first of February unrestricted submarine warfare
            Concealed within his fortress, the lord of Mordor sees all
        """.trimIndent()

        No11365().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
