def find_min_value(xs):
    minimuim  = xs[0]
    for i in range(len(xs)) :
        if xs[i] < minimuim :
            minimuim = xs[i]
        else :
            minimuim = minimuim
    return minimuim

xs = [5 , 4 , -9 , 21]
min_value =  find_min_value(xs)
print(f"the min value : {min_value}")

