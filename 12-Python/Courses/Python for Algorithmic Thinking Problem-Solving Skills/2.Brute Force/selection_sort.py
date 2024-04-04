"""
Find the smallest elemnt in array and exchange it with the fist element 
Find the second smallest elemtn in the array and exchange it whith the elemtn in the second postion
until the array is sorted
"""

def selection_sort(xs):
    for i in range(len(xs) - 1): 
        min_index = i
        for j in range(i+1, len(xs)):
            if xs[j] < xs[min_index]:
                min_index = j
        xs[i], xs[min_index] = xs[min_index], xs[i]
    return xs

xs = [3,2,1,5,4]
print(xs)
selection_sort(xs)
print(xs)


print(all(xs[i] <= xs[i+1] for i in range(len(xs) -1)))




