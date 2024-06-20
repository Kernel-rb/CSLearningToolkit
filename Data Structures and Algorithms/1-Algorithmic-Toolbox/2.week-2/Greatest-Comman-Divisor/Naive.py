def gcd(a , b ) : 
    s = 0 
    z = a +b
    for i in range(1 , z) :
        if a % i == 0  and  b % i == 0 :
            s = i 
    return  s


print(gcd(357,234))