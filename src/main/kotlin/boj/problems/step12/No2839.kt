package boj.problems.step12

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2839.solve(input.readLine().toInt()).toString())

    input.close()
    output.flush()
    output.close()
}

object No2839 {
    fun solve(input: Int): Int {
        var five = input / 5
        var three = 0
        var result = -1

        while (five >= 0) {
            if ((input - five * 5) % 3 == 0) {
                three = (input - five * 5) / 3
                result = five + three
                break
            }
            five--
        }

        return result
    }
}
