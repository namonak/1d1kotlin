package boj.problems

import java.io.BufferedReader

class No15686 {
    private data class Point(val row: Int, val col: Int) {
        fun distanceTo(other: Point): Int {
            return kotlin.math.abs(row - other.row) + kotlin.math.abs(col - other.col)
        }
    }

    private data class City(
        val houses: List<Point>,
        val chickens: List<Point>
    )

    fun solve(input: BufferedReader): String {
        val (size, selectedChickenCount) = input.readLine().split(" ").map { it.toInt() }
        val city = readCity(input, size)
        return findMinimumChickenDistance(city, selectedChickenCount).toString()
    }

    private fun readCity(
        input: BufferedReader,
        size: Int
    ): City {
        val houses = mutableListOf<Point>()
        val chickens = mutableListOf<Point>()

        repeat(size) { row ->
            input.readLine().split(" ").map { it.toInt() }.forEachIndexed { col, value ->
                addLocation(value, Point(row, col), houses, chickens)
            }
        }

        return City(houses, chickens)
    }

    private fun addLocation(
        value: Int,
        point: Point,
        houses: MutableList<Point>,
        chickens: MutableList<Point>
    ) {
        when (value) {
            HOUSE -> houses.add(point)
            CHICKEN -> chickens.add(point)
        }
    }

    private fun findMinimumChickenDistance(
        city: City,
        selectedChickenCount: Int
    ): Int {
        return searchMinimumDistance(
            city = city,
            selectedChickenCount = selectedChickenCount,
            chickenIndex = 0,
            selectedChickens = mutableListOf(),
            currentBest = Int.MAX_VALUE
        )
    }

    private fun searchMinimumDistance(
        city: City,
        selectedChickenCount: Int,
        chickenIndex: Int,
        selectedChickens: MutableList<Point>,
        currentBest: Int
    ): Int {
        if (selectedChickens.size == selectedChickenCount) {
            return minOf(currentBest, calculateCityChickenDistance(city.houses, selectedChickens))
        }
        if (chickenIndex == city.chickens.size) return currentBest

        selectedChickens.add(city.chickens[chickenIndex])
        val bestWithCurrent = searchMinimumDistance(
            city,
            selectedChickenCount,
            chickenIndex + 1,
            selectedChickens,
            currentBest
        )
        selectedChickens.removeAt(selectedChickens.lastIndex)

        return searchMinimumDistance(
            city,
            selectedChickenCount,
            chickenIndex + 1,
            selectedChickens,
            bestWithCurrent
        )
    }

    private fun calculateCityChickenDistance(
        houses: List<Point>,
        selectedChickens: List<Point>
    ): Int {
        return houses.sumOf { house ->
            selectedChickens.minOf { chicken -> house.distanceTo(chicken) }
        }
    }

    private companion object {
        const val HOUSE = 1
        const val CHICKEN = 2
    }
}
