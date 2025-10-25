package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.max

class No12790 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().trim().toInt()
        val out = StringBuilder()

        repeat(t) {
            val st = StringTokenizer(input.readLine())
            val base = Stats(
                hp = st.nextToken().toInt(),
                mp = st.nextToken().toInt(),
                atk = st.nextToken().toInt(),
                def = st.nextToken().toInt()
            )
            val equip = Stats(
                hp = st.nextToken().toInt(),
                mp = st.nextToken().toInt(),
                atk = st.nextToken().toInt(),
                def = st.nextToken().toInt()
            )

            val finalStats = base.withEquipment(equip).clamped()
            val power = finalStats.power()

            out.appendLine("$power")
        }

        return out.toString().trimEnd()
    }

    private data class Stats(val hp: Int, val mp: Int, val atk: Int, val def: Int)

    private fun Stats.withEquipment(e: Stats): Stats = Stats(hp + e.hp, mp + e.mp, atk + e.atk, def + e.def)

    // 문제 조건에 따른 하한 처리: HP/MP는 최소 1, ATK는 최소 0, DEF는 제한 없음
    private fun Stats.clamped(): Stats =
        Stats(
            hp = max(1, hp),
            mp = max(1, mp),
            atk = max(0, atk),
            def = def
        )

    // 전투력 = 1*HP + 5*MP + 2*ATK + 2*DEF
    private fun Stats.power(): Int = hp + 5 * mp + 2 * atk + 2 * def
}
