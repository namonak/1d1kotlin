package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No29807 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val scores = IntArray(SUBJECT_COUNT)

        if (t > 0) {
            val st = StringTokenizer(input.readLine())
            for (i in 0 until t) {
                scores[i] = st.nextToken().toInt()
            }
        }

        val korean = scores[KOREAN]
        val math = scores[MATH]
        val english = scores[ENGLISH]
        val inquiry = scores[INQUIRY]
        val secondLanguage = scores[SECOND_LANGUAGE]

        val languageValue =
            if (korean > english) {
                (korean - english) * HUMANITIES_BUILDING
            } else {
                (english - korean) * INTERNATIONAL_BUILDING
            }

        val mathValue =
            if (math > inquiry) {
                (math - inquiry) * ENGINEERING_BUILDING
            } else {
                (inquiry - math) * ITBT_BUILDING
            }

        val secondLanguageValue = secondLanguage * HANGWON_PARK

        val studentId = (languageValue + mathValue + secondLanguageValue) * POST_CODE
        return studentId.toString()
    }

    companion object {
        private const val SUBJECT_COUNT = 5

        private const val KOREAN = 0
        private const val MATH = 1
        private const val ENGLISH = 2
        private const val INQUIRY = 3
        private const val SECOND_LANGUAGE = 4

        private const val HUMANITIES_BUILDING = 508
        private const val INTERNATIONAL_BUILDING = 108
        private const val ENGINEERING_BUILDING = 212
        private const val ITBT_BUILDING = 305
        private const val HANGWON_PARK = 707
        private const val POST_CODE = 4763
    }
}
