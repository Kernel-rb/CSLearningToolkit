"""
 i , j => O(n²)
 k => O(n)

 donc => O(n²+n)
 on sait que n est non dominant 
 donc 0(n²)

"""

def print_itmes(n):
    for i in range(n):
        for j in range(n):
            print(i , j)
    for k in range(n):
        print(k)


print_itmes(2)