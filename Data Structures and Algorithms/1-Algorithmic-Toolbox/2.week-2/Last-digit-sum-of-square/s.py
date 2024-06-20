def sumofSquares(n) -> int:
    if n == 0:
        return 0
    if n == 1:
        return 1

    a, b = 0, 1
    sum_squares = a**2 + b**2
    
    for _ in range(2, n + 1):
        c = a + b
        a = b
        b = c
        sum_squares += b**2

    return sum_squares % 10

n = int(input())
print(sumofSquares(n))
