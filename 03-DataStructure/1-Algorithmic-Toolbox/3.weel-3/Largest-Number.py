def max_number_from_digit(n:list[int]): 
    a = ""
    while len(n) != 0 :
        m = max(n) 
        a += str(m)
        n.remove(m)
    return a

n = [9,8,9,6,1]
print(max_number_from_digit(n))
