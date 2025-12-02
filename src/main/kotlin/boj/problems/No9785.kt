package boj.problems

import java.io.BufferedReader

class No9785 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }

        val skills = ArrayList<Skill>(n)
        repeat(n) {
            val (damage, time) = input.readLine().split(" ").map { it.toInt() }
            skills.add(Skill(damage, time))
        }

        skills.sort()

        var totalDamage = 0
        var minTime = Int.MAX_VALUE

        for (i in 0 until m) {
            val skill = skills[i]
            totalDamage += skill.damage
            if (skill.time < minTime) {
                minTime = skill.time
            }
        }

        return "$totalDamage $minTime"
    }

    private data class Skill(val damage: Int, val time: Int) : Comparable<Skill> {
        override fun compareTo(other: Skill): Int {
            // 1순위: 데미지 내림차순 (높은 데미지 우선)
            if (this.damage != other.damage) {
                return other.damage.compareTo(this.damage)
            }
            // 2순위: 시간 내림차순 (데미지가 같다면 긴 시간 우선)
            return other.time.compareTo(this.time)
        }
    }
}
