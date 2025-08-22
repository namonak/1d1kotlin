package boj.problems

import java.io.BufferedReader

class No26537 {
    data class Point(val x: Int, val y: Int) : Comparable<Point> {
        // 문제의 정렬 조건에 따라 x, y 순으로 비교합니다.
        override fun compareTo(other: Point): Int {
            return if (this.x != other.x) {
                this.x.compareTo(other.x)
            } else {
                this.y.compareTo(other.y)
            }
        }
    }

    private fun squaredDistance(p1: Point, p2: Point): Long {
        val dx = (p1.x - p2.x).toLong()
        val dy = (p1.y - p2.y).toLong()
        return dx * dx + dy * dy
    }

    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().toInt()
        val results = mutableListOf<String>()

        repeat(testCaseCount) {
            val animalCount = input.readLine().toInt()
            val animals = mutableListOf<Point>()

            repeat(animalCount) {
                val (x, y) = input.readLine().split(" ").map { it.toInt() }
                animals.add(Point(x, y))
            }

            if (animalCount < 2) {
                // 동물이 2마리 미만이면 가장 가까운 쌍이 존재하지 않으므로, 다음 케이스로 넘어갑니다.
                results.add("")
                return@repeat
            }

            var minDistance = Long.MAX_VALUE
            var closestPair: Pair<Point, Point>? = null

            // 브루트 포스 알고리즘을 사용하여 모든 쌍의 거리를 계산합니다.
            for (i in 0 until animalCount) {
                for (j in i + 1 until animalCount) {
                    val p1 = animals[i]
                    val p2 = animals[j]
                    val currentDistance = squaredDistance(p1, p2)

                    // 현재 거리가 최소 거리보다 작다면 업데이트합니다.
                    if (currentDistance < minDistance) {
                        minDistance = currentDistance
                        // 정렬 조건을 만족시키기 위해 Pair에 저장 시 항상 첫 번째 점이 더 작은 값으로 오도록 합니다.
                        closestPair = if (p1 < p2) {
                            Pair(p1, p2)
                        } else {
                            Pair(p2, p1)
                        }
                    } else if (currentDistance == minDistance) {
                        // 거리가 동일하다면 문제의 정렬 조건에 따라 더 작은 쌍을 선택합니다.
                        val newPair = if (p1 < p2) {
                            Pair(p1, p2)
                        } else {
                            Pair(p2, p1)
                        }

                        // 기존의 가장 가까운 쌍과 새로운 쌍을 비교하여 더 작은 쌍을 선택합니다.
                        val currentFirstPoint = closestPair!!.first
                        val newFirstPoint = newPair.first

                        if (newFirstPoint < currentFirstPoint) {
                            closestPair = newPair
                        } else if (newFirstPoint.compareTo(currentFirstPoint) == 0) {
                            val currentSecondPoint = closestPair.second
                            val newSecondPoint = newPair.second
                            if (newSecondPoint < currentSecondPoint) {
                                closestPair = newPair
                            }
                        }
                    }
                }
            }

            // 결과를 문자열로 변환하여 저장합니다.
            if (closestPair != null) {
                results.add("${closestPair.first.x} ${closestPair.first.y} ${closestPair.second.x} ${closestPair.second.y}")
            }
        }

        return results.joinToString("\n")
    }
}
