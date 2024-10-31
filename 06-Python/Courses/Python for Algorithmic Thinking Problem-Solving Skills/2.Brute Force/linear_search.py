def linear_search(data , target):
    for i in data :
        if data[i] == target :
            return i 
    return -1



data = [4 , 5 , 2 , 7 , 1 , 8]
target = 1 

resultat = linear_search(data , target)

if resultat == -1 :
    print("item not found")
else: 
    print(f"item found at position  {resultat}")