package leetcode.problems.lv0easy

class RomanToInteger {
    fun romanToInt(s: String) : Int {
        var result = 0
        var i = 0
        while (i < s.length) {
            when (s[i]) {
                'I' -> {
                    if (i + 1 < s.length && s[i + 1] == 'V') {
                        result += 4
                        i++
                    } else if (i + 1 < s.length && s[i + 1] == 'X') {
                        result += 9
                        i++
                    } else {
                        result += 1
                    }
                }
                'X' -> {
                    if (i + 1 < s.length && s[i + 1] == 'L') {
                        result += 40
                        i++
                    } else if (i + 1 < s.length && s[i + 1] == 'C') {
                        result += 90
                        i++
                    } else {
                        result += 10
                    }
                }
                'C' -> {
                    if (i + 1 < s.length && s[i + 1] == 'D') {
                        result += 400
                        i++
                    } else if (i + 1 < s.length && s[i + 1] == 'M') {
                        result += 900
                        i++
                    } else {
                        result += 100
                    }
                }
                'V' -> result += 5
                'L' -> result += 50
                'D' -> result += 500
                'M' -> result += 1000
            }
            i++
        }
        return result
    }
}