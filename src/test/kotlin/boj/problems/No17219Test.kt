package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17219Test : StringSpec({
    "비밀번호 찾기 : https://www.acmicpc.net/problem/17219" {
        val given = """
            16 4
            noj.am IU
            acmicpc.net UAENA
            startlink.io THEKINGOD
            google.com ZEZE
            nate.com VOICEMAIL
            naver.com REDQUEEN
            daum.net MODERNTIMES
            utube.com BLACKOUT
            zum.com LASTFANTASY
            dreamwiz.com RAINDROP
            hanyang.ac.kr SOMEDAY
            dhlottery.co.kr BOO
            duksoo.hs.kr HAVANA
            hanyang-u.ms.kr OBLIVIATE
            yd.es.kr LOVEATTACK
            mcc.hanyang.ac.kr ADREAMER
            startlink.io
            acmicpc.net
            noj.am
            mcc.hanyang.ac.kr
        """.trimIndent()
        val expected = """
            THEKINGOD
            UAENA
            IU
            ADREAMER
        """.trimIndent()

        No17219().solve(given.reader().buffered()) shouldBe expected
    }
})
