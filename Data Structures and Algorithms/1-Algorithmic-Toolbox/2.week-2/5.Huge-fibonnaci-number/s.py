def pisano_period_length(m):
    a, b = 0, 1
    for i in range(1, m * m): 
        a, b = b, (a + b) % m
        if a == 0 and b == 1: 
            return i

def hugeFibNum(n, m):
    pisano_length = pisano_period_length(m)
    n = n % pisano_length
    
    if n <= 1:
        return n
    
    a, b = 0, 1
    for _ in range(2, n + 1):
        a, b = b, (a + b) % m
    
    return b


i = input()
n, m = map(int, i.split())


print(hugeFibNum(n, m))