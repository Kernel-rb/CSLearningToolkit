def print_items(n):
    for i  in range(n):
        print(i)
    for j in range(n):
        print(j)



def print_items(a , b):
    for i  in range(a): # O(a)
        print(i)
    for j in range(b): # O(b)
        print(j)
                       # O(a+b)
        
def print_items(a , b):
    for i  in range(a):     # O(a)
        for j in range(b):  # O(b)
            print(i ,j)     # O (a * b)
                   