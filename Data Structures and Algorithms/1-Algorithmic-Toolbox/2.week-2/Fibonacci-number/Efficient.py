n = int(input())
def fibonacci(n):
    if n <= 1 :
        return n 
    a = 0 
    b = 1 
    c = 0 
    for _ in range(2,n+1):
        c = a + b 
        a = b 
        b = c
    return c 

print(fibonacci(n))
