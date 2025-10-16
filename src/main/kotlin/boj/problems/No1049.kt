package boj.problems

import java.io.BufferedReader

class No1049 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val (minPackage, minPiece) = (1..m).fold(Pair(Int.MAX_VALUE, Int.MAX_VALUE)) { acc, _ ->
            val (packagePrice, piecePrice) = input.readLine().split(" ").map { it.toInt() }
            Pair(minOf(acc.first, packagePrice), minOf(acc.second, piecePrice))
        }
        val minPackageCount = n / 6
        val minPieceCount = n % 6
        val minPrice = minOf(
            minPackage * minPackageCount + minPiece * minPieceCount,
            minPackage * (minPackageCount + 1),
            minPiece * n
        )
        return minPrice.toString()
    }
}
