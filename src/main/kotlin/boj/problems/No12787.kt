package boj.problems

import java.io.BufferedReader
import java.lang.StringBuilder

class No12787 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().trim().toInt()
        val out = StringBuilder()

        repeat(t) { caseIdx ->
            val line = input.readLine()
            val (mStr, nStr) = line.trim().split(" ", limit = 2)
            val m = mStr.toInt()

            val result = when (m) {
                1 -> ipv8ToULong(nStr).toString() // IPv8 -> unsigned decimal
                2 -> uLongToIpv8(nStr.toULong()) // unsigned decimal -> IPv8
                else -> error("Invalid mode")
            }

            out.append(result)
            if (caseIdx != t - 1) out.append('\n')
        }

        return out.toString().trimEnd()
    }

    private fun ipv8ToULong(addr: String): ULong {
        // "a.b.c.d.e.f.g.h" 각 a..h는 0..255
        val parts = addr.split('.')
        require(parts.size == 8) { "IPv8 must have 8 octets" }

        var value = 0uL
        for (p in parts) {
            val byteVal = p.toInt()
            require(byteVal in 0..255) { "Octet out of range: $byteVal" }
            value = (value shl 8) or byteVal.toULong()
        }
        return value
    }

    private fun uLongToIpv8(v: ULong): String {
        // 상위 바이트부터 하위 바이트까지 출력
        val sb = StringBuilder()
        for (i in 7 downTo 0) {
            val octet = ((v shr (i * 8)) and 0xFFu).toUInt().toInt()
            sb.append(octet)
            if (i != 0) sb.append('.')
        }
        return sb.toString()
    }
}
