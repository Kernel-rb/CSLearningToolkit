# dict =  key ; value
# dict => faire des algorithmes plus puissants 
information ={
    "name"  : "saif" ,
    "age"   : 19 ,
    "etudiant" : True ,
}

print(information["name"])

age:int = information.get("age")
if age >= 18 :
    print("Majeur")
elif age < 18 :
    print("Mineur")
else: 
    print("Enter a valid number")

# Exemple
repertoire = {
    "Saif Matab" : {
        "age" : 19,
        "tel" :"0612213410"
    },
    "Kernel Vambo" : {
        "age" : 29 ,
        "tel" : "06211210340",
    }
}

wanted = "Kernel Vambo"
acces_info = repertoire.get(wanted)
print(acces_info)


for key in repertoire:
    print(key)
    print(repertoire[key])