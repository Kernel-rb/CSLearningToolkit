def ma(a) :
    """
    L1 : 
    e = "" 
    a.sort(reverse=True)
    for i in a : 
        e += str(i) 
    return int(e)
    """
    e = ""
    while len(a) : 
        e += str(max(a)) 
        a.remove(max(a))
    return e
s

r = print(ma([9,8,9,6,1]))