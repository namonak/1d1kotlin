package leetcode.problems.lv0easy

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        var carry = 1
        for (i in digits.lastIndex downTo 0) {
            val sum = digits[i] + carry
            digits[i] = sum % 10
            carry = sum / 10
        }
        if (carry == 1) {
            val newDigits = IntArray(digits.size + 1)
            newDigits[0] = 1
            for (i in digits.indices) {
                newDigits[i + 1] = digits[i]
            }
            return newDigits
        }
        return digits
    }
}
