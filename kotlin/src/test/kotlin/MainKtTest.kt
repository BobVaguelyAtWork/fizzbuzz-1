import org.example.fizzbuzzNoMath
import org.example.fizzbuzzOf
import org.example.fizzbuzzUpTo
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainKtTest {
    @Test
    fun `fizzbuzz returns the right words`() {
        assertEquals(listOf(3, 5, 15, 1500).map(::fizzbuzzOf), listOf("Fizz", "Buzz", "FizzBuzz", "FizzBuzz"))
    }

    @Test
    fun `the first twenty fizzbuzz values are correct`() {
        assertEquals(
            fizzbuzzUpTo(20),
            listOf(
                "1", "2", "Fizz", "4", "Buzz",
                "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz",
                "16", "17", "Fizz", "19", "Buzz"
            )
        )
    }

    @Test
    fun `extra credit - fizzbuzz without modulus`() {
        val actual = fizzbuzzNoMath(100)
        assertEquals(100, actual.size)
        assertTrue { actual.windowed(size = 3, step = 3, partialWindows = false) { it.last() }.all { it.contains("Fizz") } }
        assertTrue { actual.windowed(size = 5, step = 5, partialWindows = false) { it.last() }.all { it.contains("Buzz") } }
        assertTrue { actual.windowed(size = 15, step = 15, partialWindows = false) { it.last() }.all { it == "FizzBuzz" } }
        assertTrue { actual.all { it.matches(Regex("\\d+|Fizz|Buzz|FizzBuzz")) } }
    }
}