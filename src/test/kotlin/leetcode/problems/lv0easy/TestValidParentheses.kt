package leetcode.problems.lv0easy

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class TestValidParentheses : StringSpec({
    "testValidParentheses" {
        val testCases = arrayOf(
            row("()", true),
            row("()[]{}", true),
            row("[]", true),
            row("{}", true),
            row("{()}", true),
            row("{([])}", true),
            row("(]", false),
            row("{{", false),
            row("{)", false),
            row(")", false),
            row(")(", false)
        )

        val validParentheses = ValidParentheses()

        testCases.forEach { (given, want) ->
            val actual = validParentheses.isValid(given)

            actual shouldBe want
        }
    }
})
