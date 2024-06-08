package boj.problems

import java.io.BufferedReader

class No1408 {
    fun solve(input: BufferedReader): String {
        val current = input.readLine().split(":")
        val target = input.readLine().split(":")

        val currentTime = current[0].toInt() * 3600 + current[1].toInt() * 60 + current[2].toInt()
        val targetTime = target[0].toInt() * 3600 + target[1].toInt() * 60 + target[2].toInt()

        val diff = if (currentTime > targetTime) 86400 - currentTime + targetTime else targetTime - currentTime

        val hour = diff / 3600
        val minute = diff % 3600 / 60
        val second = diff % 60

        return "%02d:%02d:%02d".format(hour, minute, second)
    }
}
