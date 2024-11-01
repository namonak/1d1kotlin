package boj.problems

import java.io.BufferedReader

class No16205 {
    companion object {
        const val CAMEL_CASE = 1
        const val SNAKE_CASE = 2
        const val PASCAL_CASE = 3
    }

    fun solve(input: BufferedReader): String {
        val (style, name) = input.readLine().split(" ", limit = 2)
        val styleInt = style.toIntOrNull() ?: throw IllegalArgumentException("Invalid style number")

        return when (styleInt) {
            CAMEL_CASE -> convertFromCamel(name)
            SNAKE_CASE -> convertFromSnake(name)
            PASCAL_CASE -> convertFromPascal(name)
            else -> throw IllegalArgumentException("Invalid style number")
        }
    }

    private fun convertFromCamel(name: String): String {
        val snakeCaseResult = toSnakeCase(name)
        val pascalCaseResult = name.replaceFirstChar { it.uppercaseChar() }
        return "$name\n$snakeCaseResult\n$pascalCaseResult"
    }

    private fun convertFromSnake(name: String): String {
        val camelCaseResult = toCamelCase(name)
        val pascalCaseResult = toPascalCase(name)
        return "$camelCaseResult\n$name\n$pascalCaseResult"
    }

    private fun convertFromPascal(name: String): String {
        val camelCaseResult = name.replaceFirstChar { it.lowercaseChar() }
        val snakeCaseResult = toSnakeCase(name)
        return "$camelCaseResult\n$snakeCaseResult\n$name"
    }

    private fun toCamelCase(snakeStr: String): String {
        val components = snakeStr.split('_')
        return components[0] + components.drop(1).joinToString("") { it.replaceFirstChar { char -> char.uppercaseChar() } }
    }

    private fun toSnakeCase(camelStr: String): String {
        return camelStr.fold("") { acc, c ->
            if (c.isUpperCase()) acc + "_" + c.lowercaseChar() else acc + c
        }.trimStart('_')
    }

    private fun toPascalCase(snakeStr: String): String {
        return snakeStr.split('_').joinToString("") { it.replaceFirstChar { char -> char.uppercaseChar() } }
    }
}
