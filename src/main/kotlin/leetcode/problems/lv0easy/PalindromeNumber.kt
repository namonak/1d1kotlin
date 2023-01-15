package leetcode.problems.lv0easy

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }

        val temp = x.toString()
        var head = 0
        var tail = temp.length - 1

        while (head < tail) {
            if (temp[head] != temp[tail]) {
                return false
            }
            head++
            tail--
        }

        return true
    }
}
