package com.merrylab.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

object GherkinExampleTest: Spek({

    Feature("Math") {

        Scenario("足し算") {

            val one = 1

            var result = 0

            When("1+1") {
                result = one + 1
            }
            Then("it should be 2") {
                assertEquals(result, 2)
            }
        }
    }
})