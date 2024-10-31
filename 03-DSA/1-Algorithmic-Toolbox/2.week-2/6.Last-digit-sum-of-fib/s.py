def fib(n) -> int:
    if n <= 1:
        return n

    fib_sequence = [0] * (n + 1)
    fib_sequence[1] = 1
    
    for i in range(2, n + 1):
        fib_sequence[i] = fib_sequence[i - 1] + fib_sequence[i - 2]
    
    return fib_sequence[n]

def sumFibNum(n) -> int:
    if n <= 1:
        return n
    
    pisano_period = 60
    n = n % pisano_period
    
    fib_sum = 0
    a, b = 0, 1
    
    for _ in range(n + 1):
        fib_sum += a
        a, b = b, (a + b) % 10
    
    return fib_sum % 10

n = int(input())
print(sumFibNum(n))
