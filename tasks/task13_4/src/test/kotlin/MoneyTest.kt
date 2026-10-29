// Task 13.4: unit tests for Money class

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class MoneyTest : FreeSpec({
    "Can create a Money 0.00" {
        val m = Money(0, 0)
        withClue("euros") { m.euros shouldBe 0 }
        withClue("cents") { m.cents shouldBe 0 }
    }

    "Can create a Money 2.99" {
        val m = Money(2, 99)
        withClue("euros") { m.euros shouldBe 2 }
        withClue("cents") { m.cents shouldBe 99 }
    }

    "Exception when creating Money with negative euros" {
        shouldThrow<IllegalArgumentException> {
            Money(-1, 0)
        }
    }

    "Exception when creating Money with negative euros" {
        shouldThrow<IllegalArgumentException> {
            Money(0, -1)
        }
    }

    "€1.50 + €1.00 is €2.50" {
        Money(1, 50) + Money(1, 0) shouldBe Money(2, 50)
    }

    "€2.99 + €0.01 is €3.00" {
        Money(2, 99) + Money(0, 1) shouldBe Money(3, 0)
    }

    "€1.50 + €0.01 is €1.51" {
        Money(1, 50) + Money(0, 1) shouldBe Money(1, 51)
    }

    "€1.50 < €1.51" {
        (Money(1, 50) < Money(0, 1)) shouldBe false
    }

    "Money(1, 50).toSting => €1.50" {
        Money(1, 50).toString() shouldBe "€1.50"
    }
})
