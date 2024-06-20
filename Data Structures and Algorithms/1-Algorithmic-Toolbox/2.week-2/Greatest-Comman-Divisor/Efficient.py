i = input()
a, b = map(int, i.split())
def gcd(a, b):
    if b == 0:
        return a
    a_ = a % b
    return gcd(b, a_)
print(gcd(a, b))
