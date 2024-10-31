def swap(arr , i , j):
    temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp

def pivot(arr , pivot_i , end_i):
    swap_i = pivot_i
    for i in range(pivot_i + 1 , end_i + 1) :
        if arr[i] < arr[pivot_i] : 
            swap_i += 1 
            swap(arr , swap_i , i)
    swap(arr , pivot_i , swap_i)

    return swap_i

     

