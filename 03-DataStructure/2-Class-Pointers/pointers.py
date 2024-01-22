#################################################
#  C pas la meme chose pour les dictionnaires  #
#      !dict can be changed                   #
###############################################


num1 = 11 
num2 = num1


print(f"""
Before num2 value is updated : 
      num1 = {num1}
      num2 = {num2}
      """)

print("num1 points to :" , id(num1)) # adress of num1 is stored
print("num2 points to :" , id(num2)) # adress of num2 is stored

####################################################################
num3 = 11 
num4 = num3
num4 = 22

print(f"""
Before num2 value is updated : 
      num3 = {num3}
      num4 = {num4}
      """)

print("num1 points to :" , id(num3)) # adress of num1 is stored
print("num2 points to :" , id(num4)) # adress of num2 is stored

