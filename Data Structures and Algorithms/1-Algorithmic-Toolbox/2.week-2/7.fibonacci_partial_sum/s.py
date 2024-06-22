def fib(n) -> int:
    if n <= 1:
        return n
    
    fib_sequence = [0] * (n + 1)
    fib_sequence[1] = 1
    
    for i in range(2, n + 1):
        fib_sequence[i] = fib_sequence[i - 1] + fib_sequence[i - 2]
    
    return fib_sequence[n]

def sumFibNum(a, b) -> int:
    sum_mod_10 = 0
    for i in range(a, b + 1):
        sum_mod_10 = (sum_mod_10 + fib(i)) % 10
    
    return sum_mod_10

# Read input
o = input()
a, b = map(int, o.split())

# Print the result of sumFibNum(a, b)
print(sumFibNum(a, b))
