n = int(input())

def fib(n) -> int  : 
    if n <= 1 :
        return n  
    a = 0 
    b = 1 
    for _ in range(2 , n+1) :
        c = a + b
        a = b 
        b = c
    return c

def sumFibNum(n) -> int  : 
    counter =  0 
    for i in range(n+1) :
        counter += fib(i)
    counter %= 10
    return counter


print(sumFibNum(n))
