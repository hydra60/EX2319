object Hello {
    def main(args: Array[String]) = {
        fibonacci_est(5)
    }

    def fibonacci_est(n: Int): Int = {        
        var a = 1;
        var b = 0;   
        var f = 0;
        var i = 0;
        for (i<- 1 to n) {
            println(f)
            f = a + b
            a = b
            b = f
        }
    }
}