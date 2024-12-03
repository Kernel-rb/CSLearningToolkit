# Complexités des algorithmes de tri

# Bubble Sort
# Best Case: O(n)         # Quand le tableau est déjà trié
# Average Case: O(n^2)    # Dans le cas moyen
# Worst Case: O(n^2)      # Quand le tableau est trié à l'envers
# Space Complexity: O(1)   # Tri en place, pas d'espace supplémentaire

# Selection Sort
# Best Case: O(n^2)       # Toujours O(n^2), même si le tableau est déjà trié
# Average Case: O(n^2)
# Worst Case: O(n^2)
# Space Complexity: O(1)

# Insertion Sort
# Best Case: O(n)         # Quand le tableau est déjà trié
# Average Case: O(n^2)
# Worst Case: O(n^2)
# Space Complexity: O(1)

def bubble_sort(arr):
    n = len(arr) 
    for i in range(n -1 ,0 , -1): 
        for j in range(i) :
            if arr[j] > arr[j + 1] :
                arr[j] , arr[j+1] = arr[j+1] , arr[j]
    return arr 

def selection_sort(arr) : 
    for i in range(len(arr) - 1 ) : 
        min_i = i 
        for  j in range(i+1,len(arr)):
            if arr[j] < arr[min_i]: 
                min_i = j 
        if i != min_i : 
            temp = arr[i]
            arr[i] = arr[min_i]
            arr[min] = temp 
    return arr


def insertion_sort(arr) : 
    for i in range(1,len(arr)):
        temp = arr[i]
        j = i -1 
        while temp < arr[j] : 
            arr[j+1] = arr[j]  
            arr[j] = temp 
            j -= 1
    return arr
