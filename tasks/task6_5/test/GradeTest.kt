// Task 6.5: unit tests for grade

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    "negative gives error" {
        grade(-10) shouldBe "?"
    }

    "test illegal-Fail boundary" {
        grade(-1) shouldBe "?"
        grade(0) shouldBe "Fail"
        grade(1) shouldBe "Fail"
    }

    "mid-range Fail" {
         grade(25) shouldBe "Fail"
    }

    "test fail-pass boundary" {
         grade(39) shouldBe "Fail"
         grade(40) shouldBe "Pass"
         grade(41) shouldBe "Pass"
    }

    "mid-range Pass" {
         grade(55) shouldBe "Pass"
    }

    "test pass-distinction boundary" {
         grade(69) shouldBe "Pass"
         grade(70) shouldBe "Distinction"
         grade(71) shouldBe "Distinction"
    }

    "mid-range Distinction" {
         grade(85) shouldBe "Distinction"
    }

    "test distinction-illegal boundary" {
         grade(99) shouldBe "Distinction"
         grade(100) shouldBe "Distinction"
         grade(101) shouldBe "?"
    }
})
