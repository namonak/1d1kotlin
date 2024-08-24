package boj.problems

import java.io.BufferedReader

class No1350 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val files = input.readLine().split(" ").map { it.toInt() }
        val clusterSize = input.readLine().toInt()
        var totalSize = 0L

        files.forEach { file ->
            totalSize += (file / clusterSize + if (file % clusterSize == 0) 0 else 1) * clusterSize
        }

        return totalSize.toString()
    }
}
