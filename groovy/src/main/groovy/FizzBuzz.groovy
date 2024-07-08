class FizzBuzz {

    /**
     * Compute the fizzbuzz value of a given number
     * @param n number to be fizzbuzzed
     * @return "Fizz", "Buzz", "FizzBuzz", or `n` as a String 
     */
    static String fizzbuzzOf(int n) {
        String ret = n
        if (!(n % 3)) return "Fizz"
        if (!(n % 5)) return "Buzz"
        return ret
    }

    /**
     * Make a list of fizzbuzz values from 1 to n
     * @param n the end of the sequence to be fizzbuzzed
     * @return a list of fizzbuzz values
     */
    static List<String> fizzbuzzUpTo(int n) {
        (1..<n).collect { fizzbuzzOf(it) }
    }
}