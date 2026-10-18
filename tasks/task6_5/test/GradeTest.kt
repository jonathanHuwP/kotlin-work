// Task 6.5: unit tests for grade

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    "negative gives error" {
        withClue("mark=-10") {grade(-10) shouldBe "?"}
    }

    "test illegal-Fail boundary" {
          assertSoftly {
               withClue("mark=-1") {grade(-1) shouldBe "?"}
               withClue("mark=0") {grade(0) shouldBe "Fail"}
               withClue("mark=1") {grade(1) shouldBe "Fail"}
          }
    }

    "mid-range Fail" {
         withClue("mark=25") {grade(25) shouldBe "Fail"}
    }

    "test fail-pass boundary" {
          assertSoftly {
               withClue("mark=39") {grade(39) shouldBe "Fail"}
               withClue("mark=40") {grade(40) shouldBe "Pass"}
               withClue("mark=41") {grade(41) shouldBe "Pass"}
          }
    }

    "mid-range Pass" {
         withClue("mark=55") {grade(55) shouldBe "Pass"}
    }

    "test pass-distinction boundary" {
          assertSoftly {
               withClue("mark=69") {grade(69) shouldBe "Pass"}
               withClue("mark=70") {grade(70) shouldBe "Distinction"}
               withClue("mark=71") {grade(71) shouldBe "Distinction"}
          }
    }

    "mid-range Distinction" {
         withClue("mark=85") {grade(85) shouldBe "Distinction"}
    }

    "test distinction-illegal boundary" {
          assertSoftly {
               withClue("mark=99") {grade(99) shouldBe "Distinction"}
               withClue("mark=100") {grade(100) shouldBe "Distinction"}
               withClue("mark=101") {grade(101) shouldBe "?"}
          }
    }
})
