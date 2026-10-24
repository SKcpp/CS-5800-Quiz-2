# Quiz 2: Calculator and DateChecker

## Contents
- `Calculator`: sum, subtract, multiply, divide (throws `ArithmeticException` on divide-by-zero), isEven
- `Month`: enum of the twelve calendar months
- `DateChecker`: `has31Days(Month)`; February returns `false` (handled explicitly); `null` throws `IllegalArgumentException`

## Run the tests
```
mvn test
```
Requires JDK 17+ and Maven 3.8+.

## Design decisions
- Integer division truncates toward zero (Java `/`).
- February is not a 31-day month, so it returns `false`; this is tested explicitly.
- `null` is invalid input and throws `IllegalArgumentException`.

## Reflection on my TDD process

I developed this project using Test Driven Development (TDD), following small cycles of red, green, and refactor while committing after each step to document the code's evolution. Each feature began with a failing test; for example, `testSum` was initially written against a stub that returned 0, which verified the test's functionality. I applied this approach to the methods `subtract`, `multiply`, `divide`, and `isEven`, deliberately creating incorrect stubs to track failures, and then wrote the actual code to pass the tests.

For `DateChecker`, I started with a simple return statement for January, but later adjusted it to use an `EnumSet` for the months with 31 days as parameterized tests failed for May, July, August, October, and December. Writing tests first clarified the code requirements, eliminating guesswork. Edge cases, like handling null input, taught me the importance of thorough checks.

For the `divide` method, I throw an `ArithmeticException` with a clear message when the divisor is zero. I also streamlined tests by removing redundancies during refactoring while keeping the suite green. The discipline required to stick to TDD was a challenge, and future projects will benefit from writing fewer assertions per test to pinpoint failures more accurately.