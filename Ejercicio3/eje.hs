fib :: Integer -> Integer
fib 0 = 0
fib 1 = 1
fib n = fib (n-1) + fib (n-2)



fibonacci f x = f(x)

main = do
    print(fibonacci fib 0)
    print(fibonacci fib 1 )
    print(fibonacci fib 2 )
    print(fibonacci fib 3 )
    print(fibonacci fib 4 )
    print(fibonacci fib 5 )
    print(fibonacci fib 6 )
    print(fibonacci fib 7 )
    print(fibonacci fib 8 )
    print(fibonacci fib 9 )


