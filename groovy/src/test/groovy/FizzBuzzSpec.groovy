import spock.lang.Specification

class FizzBuzzSpec extends Specification {
    
    def '''matching numbers return the right words'''() {
        when:
        def actual = FizzBuzz.fizzbuzzOf(subject)
        then:
        actual == expected
        where:
        subject | expected
              3 | "Fizz"
              5 | "Buzz"
             15 | "FizzBuzz"
           1500 | "FizzBuzz"
    }
    
    def '''the first twenty fizzbuzzes return the right values'''() {
        when:
        def actual = FizzBuzz.fizzbuzzUpTo(20)
        then:
        actual == ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"]
    }
}
