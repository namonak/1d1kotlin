package boj.problems

import java.io.BufferedReader

class No2891 {
    fun solve(input: BufferedReader): String {
        input.readLine().split(" ").map { it.toInt() }
        val damaged = input.readLine().split(" ").map { it.toInt() }.toMutableSet()
        val reserve = input.readLine().split(" ").map { it.toInt() }.toMutableSet()

        // 여분이 있지만 자기 카약이 부서진 경우: 본인 사용 처리
        val selfRepair = damaged.intersect(reserve)
        damaged.removeAll(selfRepair)
        reserve.removeAll(selfRepair)

        // 여분을 인접 팀에게 빌려주는 처리
        val used = mutableSetOf<Int>()
        for (team in damaged.sorted()) {
            when {
                reserve.contains(team - 1) -> {
                    reserve.remove(team - 1)
                    used.add(team)
                }
                reserve.contains(team + 1) -> {
                    reserve.remove(team + 1)
                    used.add(team)
                }
            }
        }

        val notReady = damaged.size - used.size
        return "$notReady"
    }
}
