package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4358Test : StringSpec({
    "생태학 : https://www.acmicpc.net/problem/4358" {
        val given = """
            Red Alder
            Ash
            Aspen
            Basswood
            Ash
            Beech
            Yellow Birch
            Ash
            Cherry
            Cottonwood
            Ash
            Cypress
            Red Elm
            Gum
            Hackberry
            White Oak
            Hickory
            Pecan
            Hard Maple
            White Oak
            Soft Maple
            Red Oak
            Red Oak
            White Oak
            Poplan
            Sassafras
            Sycamore
            Black Walnut
            Willow
        """.trimIndent()
        val expected = """
            Ash 13.7931
            Aspen 3.4483
            Basswood 3.4483
            Beech 3.4483
            Black Walnut 3.4483
            Cherry 3.4483
            Cottonwood 3.4483
            Cypress 3.4483
            Gum 3.4483
            Hackberry 3.4483
            Hard Maple 3.4483
            Hickory 3.4483
            Pecan 3.4483
            Poplan 3.4483
            Red Alder 3.4483
            Red Elm 3.4483
            Red Oak 6.8966
            Sassafras 3.4483
            Soft Maple 3.4483
            Sycamore 3.4483
            White Oak 10.3448
            Willow 3.4483
            Yellow Birch 3.4483
        """.trimIndent()

        No4358().solve(given.reader().buffered()) shouldBe expected
    }
})
