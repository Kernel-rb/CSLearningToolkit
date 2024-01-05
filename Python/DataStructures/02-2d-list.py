#  x= 0 1 2
t = [[1,2,3] ,#0 
     [4,5,6] ,#1  = y
     [7,8,9]] #2

print(t[0][2]) #t[y][x]

for l in t  :
    for e in l :
        print(e)


for l in t :
    ligne = ""
    for e in l : 
        ligne += str(e) + " "
    print(ligne)
