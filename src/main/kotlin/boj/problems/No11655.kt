package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11655.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No11655 {
    fun solve(input: String): String {
        val stringBuilder = StringBuilder()

        input.forEach {
            if (it.isLowerCase()) {
                stringBuilder.append(
                    if (it + 13 > 'z') {
                        (it + 13 - 'z' + 'a'.code - 1).toChar()
                    } else {
                        (it + 13)
                    }
                )
            } else if (it.isUpperCase()) {
                stringBuilder.append(
                    if (it + 13 > 'Z') {
                        (it + 13 - 'Z' + 'A'.code - 1).toChar()
                    } else {
                        (it + 13)
                    }
                )
            } else {
                stringBuilder.append(it)
            }
        }

        return stringBuilder.toString()
    }
}
