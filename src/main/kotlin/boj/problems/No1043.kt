package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No1043 {
    fun solve(input: BufferedReader): String {
        var st = StringTokenizer(input.readLine())
        val n = st.nextToken().toInt()
        val m = st.nextToken().toInt()

        st = StringTokenizer(input.readLine())
        val truthCount = st.nextToken().toInt()

        // 조기 종료: 진실을 아는 사람이 없으면 모든 파티(m)에서 거짓말 가능
        if (truthCount == 0) return m.toString()

        val truthKnowers = IntArray(truthCount) { st.nextToken().toInt() }

        // 분리 집합(Disjoint Set)을 위한 부모 배열 초기화
        val parent = IntArray(n + 1) { it }

        // Find 연산 (경로 압축 최적화 적용)
        fun find(x: Int): Int {
            if (parent[x] == x) return x
            parent[x] = find(parent[x])
            return parent[x]
        }

        // Union 연산
        fun union(
            a: Int,
            b: Int
        ) {
            val rootA = find(a)
            val rootB = find(b)
            if (rootA != rootB) {
                parent[rootB] = rootA
            }
        }

        // 1단계: 진실을 아는 사람들을 모두 '하나의 진실 집합'으로 묶음
        val firstTruthKnower = truthKnowers[0]
        for (i in 1 until truthCount) {
            union(firstTruthKnower, truthKnowers[i])
        }

        val parties = mutableListOf<List<Int>>()

        // 2단계: 파티 정보를 순회하며, 같은 파티에 참석한 사람들은 '하나의 교류 집합'으로 묶음
        repeat(m) {
            st = StringTokenizer(input.readLine())
            val partySize = st.nextToken().toInt()
            val partyMembers = List(partySize) { st.nextToken().toInt() }
            parties.add(partyMembers)

            val firstMember = partyMembers[0]
            for (i in 1 until partySize) {
                // 파티의 첫 번째 사람과 나머지 사람들을 모두 연결합니다.
                // 결과적으로 파티 참석자 전원이 같은 그룹에 속하게 되며,
                // 이 중 한 명이라도 진실을 안다면 그룹 전체가 진실 집합으로 병합됩니다.
                union(firstMember, partyMembers[i])
            }
        }

        // 3단계: 최종적으로 생성된 집합을 바탕으로 안전한 파티의 개수를 구함
        var answer = 0

        // 모든 Union 연산이 끝난 후, 진실을 아는 그룹의 최종 루트(대표) 노드를 찾습니다.
        val truthRoot = find(firstTruthKnower)

        for (party in parties) {
            // 파티 참석자 중 아무나(여기서는 첫 번째 사람)의 루트를 확인합니다.
            // 루트가 진실 그룹의 루트와 다르다면, 이 파티는 진실과 완전히 단절된 상태입니다.
            if (find(party[0]) != truthRoot) {
                answer++
            }
        }
        return answer.toString()
    }
}
