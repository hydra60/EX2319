object Hello {
    def main(args: Array[String]) = {
        for (i <- 1 to 10) {
            println(fibonacci(i))
        }
        fibonacci_est(5)
    }
   

    def fibonacci(n: Int): Int = {
        if (n <= 1) n
        else fibonacci(n - 1) + fibonacci(n - 2)
    }
}