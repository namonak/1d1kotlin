package leetcode.problems.lv0easy

class AddBinary {
    fun addBinary(a: String, b: String): String {
        val aLen = a.length
        val bLen = b.length
        val maxLen = maxOf(aLen, bLen)
        val minLen = minOf(aLen, bLen)
        val result = StringBuilder()
        var carry = 0
        var i = 0
        while (i < minLen) {
            val sum = a[aLen - 1 - i].toString().toInt() + b[bLen - 1 - i].toString().toInt() + carry
            result.append(sum % 2)
            carry = sum / 2
            i++
        }
        while (i < maxLen) {
            val sum = if (aLen > bLen) a[aLen - 1 - i].toString().toInt() + carry else b[bLen - 1 - i].toString().toInt() + carry
            result.append(sum % 2)
            carry = sum / 2
            i++
        }
        if (carry > 0) result.append(carry)
        return result.reverse().toString()
    }
}