def sumofSquares(n) -> int:
    if n == 0:
        return 0
    if n == 1:
        return 1
    
    # Initialize Fibonacci sequence
    fib_sequence = [0] * (n + 1)
    fib_sequence[1] = 1
    
    sum_squares = fib_sequence[0]**2 + fib_sequence[1]**2
    
    for i in range(2, n + 1):
        fib_sequence[i] = fib_sequence[i - 1] + fib_sequence[i - 2]
        sum_squares += fib_sequence[i]**2
    
    return sum_squares % 10

# Read input
n = int(input())

# Print the result of sumofSquares(n)
print(sumofSquares(n))
