package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No5368 {
    data class Position(val row: Int, val col: Int)

    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()

        repeat(t) { caseIndex ->
            val m = input.readLine().toInt()
            lateinit var ship: Position
            val planets = mutableListOf<Position>()

            repeat(m) { r ->
                val line = input.readLine()
                for (c in line.indices) {
                    when (line[c]) {
                        's' -> ship = Position(r, c)
                        'p' -> planets += Position(r, c)
                    }
                }
            }

            val closest = findClosestPlanet(ship, planets)
            sb.append(formatResult(ship, closest))
            if (caseIndex < t - 1) sb.append('\n')
        }

        return sb.toString()
    }

    private fun findClosestPlanet(
        ship: Position,
        planets: List<Position>
    ): Position {
        var best = planets.first()
        var bestDist2 = squaredDistance(ship, best)

        for (planet in planets) {
            val dist2 = squaredDistance(ship, planet)
            if (dist2 < bestDist2 || (dist2 == bestDist2 && (planet.row < best.row || (planet.row == best.row && planet.col < best.col)))) {
                best = planet
                bestDist2 = dist2
            }
        }
        return best
    }

    private fun squaredDistance(
        a: Position,
        b: Position
    ): Long {
        val dr = a.row - b.row
        val dc = a.col - b.col
        return dr.toLong() * dr + dc.toLong() * dc
    }

    private fun formatResult(
        ship: Position,
        planet: Position
    ): String {
        val dist = sqrt(squaredDistance(ship, planet).toDouble())
        return "(${ship.row},${ship.col}):(${planet.row},${planet.col}):${"%.2f".format(dist)}"
    }
}
