
def fibonacci_estructurada(n):
    a = 1
    b = 0
    f = 0
    for i in range(n):
        print(f)
        f = a + b
        a = b
        b = f
    

fibonacci_estructurada(10)