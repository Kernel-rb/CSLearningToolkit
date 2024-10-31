import random 

def binary_search(data , target):
    low_pointer = 0 
    hight_pointer = len(data) - 1 
    while low_pointer <=  hight_pointer:
        mid_point = (low_pointer + hight_pointer)  // 2
        if data[mid_point] == target:
            return mid_point
        elif data[mid_point]  < target : 
            low_pointer = mid_point + 1
        else : 
            hight_pointer =mid_point - 1 
    return - 1 


n = 10 
max_val = 100
data = [random.randint(1,max_val) for i in range(n)]
data.sort()
print("Data:" , data)
target = int(input("Enter a target"))
target_pos = binary_search(data , target)
if target_pos == -1 :
    print("your target is not in the list")
else :
    print("your target has been found at index  " , target_pos)