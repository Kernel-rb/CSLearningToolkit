o = input()
a , b = map(int , o.split())


def LCM(a , b) -> int : 
    def GCD(a , b) -> int : 
        if b == 0 : 
            return a
        a_ = a % b
        return GCD(b , a_)
    return (a * b) // GCD(a , b)    

print(LCM(a , b))