def my_sum(lst):
    total = 0 
    for i in range(len(lst)):
        total += lst[i]
    return total


my_list = [0,4,-9 , 8]
print(my_sum(my_list))