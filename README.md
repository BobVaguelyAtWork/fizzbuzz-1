# fizzbuzz-1

Some code with some bugs...

There's a twitter quote that says "FizzBuzz was invented because no one wants to write binary
search in an interview". The rules are fairly straightforward - we count up from 1, but if the
number is divisible by 3, it's replaced with "Fizz", divisible by 5, it's replaced with "Buzz", and
divisible by 15 (or 3 and 5), it's replaced with "FizzBuzz".

The code samples here have failing tests that need to be corrected. To start:
- select the groovy or kotlin folder - each has a maven project for that particular language
- run `mvn test` from the appropriate directory to see the test failures
- fix the code to pass the tests

The kotlin project has a bit of a "stretch exercise" to create a fizzbuzz sequence without using modulus. This function gets tested by the last test in the kotlin test class, so that test doesn't need to pass for the first two functions.