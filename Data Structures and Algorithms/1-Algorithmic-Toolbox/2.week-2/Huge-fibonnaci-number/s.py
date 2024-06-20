i =  input()
n , m = map(int , i.split())
def fib(n) -> int: 
    if n <= 1 :
        return n 
    a = 0 
    b = 1 
    for _ in range(2 , n+1) :
        c = a+b 
        a = b 
        b = c
    return c

def hugeFibNum(n , m) -> int  : 
    return fib(n)  % m 



print(hugeFibNum(n , m))