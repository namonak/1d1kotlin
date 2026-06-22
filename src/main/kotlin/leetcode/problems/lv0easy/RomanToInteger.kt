package leetcode.problems.lv0easy

class RomanToInteger {
    fun romanToInt(s: String): Int {
        return s.indices.sumOf { index ->
            val current = ROMAN_VALUES.getValue(s[index])
            val next = s.getOrNull(index + 1)?.let(ROMAN_VALUES::getValue) ?: 0
            if (current < next) -current else current
        }
    }

    companion object {
        private val ROMAN_VALUES = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
    }
}
