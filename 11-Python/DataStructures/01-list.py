# Exemple de list !: 
list1:list[int] = [1, 2, 3, 4]
list2:list[str] = ["saif" , "kernel" , "mikasse"]
list3:list[bool] = [True , False , True]
list4:list[any] = [1 , 'Saif' , True]

# len d ' une list 
n = len(list1) 

#indéxation : 
zero  = list1[0]

# recuperer les éléments d 'une list : 
for i in range(n) : 
    print(list1[i])

# ou bien  :

for element in list2:
    print(element)

# ajouter des élements  à une list : 
ajout_d_elemeent:list[int] = list1.append(5)

# ou bien  ( extend => faire bcp dyal append ): 
ajout_d_elemeent:list[int] = list1.extend([7,8])

# supprimer les éléments 
delete_element:list[int] = list1.remove(1)
print(list1)

# Slice : séléctionner une partie des éléments
copie_list4:list[any] = list[:]
slice_list4:list[any] = list4[1:]
slice_list4:list[any] = list4[:-1]

# Tris / Sort 

names = ["saif" , "leonard" , "kernel"]
names.sort() # ordre alphabetique || numérique
names.sort(reverse=True) # ordre inverse
names.sort(key=lambda element:len(element)) # le plus petit en char 
sorted_lit = sorted(names , reverse=False)
#la diff entre sort() et sorted c que sort est in place et sorted  crée en mémoire une nouvelle list

# opérations

print("kernel" in names) #True
print("Kernel" in names) #False

ages:list[int] =[10 , 5 , 55 , 1]
print(sum(ages) , max(ages) , min(ages))

# ajouter un séparateur : 
separateur = "-".join(ages)

# list de len 
len_names = []
for name in names : 
    len_names.append(len(name))

# dans une seul ligne :) 
len_names_2 =[len(name) for name in names if len(name) > 4]
