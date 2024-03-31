# -----------------------------------------------
# this is a note for my python learning journey
# -----------------------------------------------
# sommary :
# 1. numbers
# 2. strings
# 3. lists
# 4. dictionaries
# 5. booleans
# 6. tuples
# 7. sets
# 8. comparaison operators
# 9. logical operators
# 10. if , elif , else
# 11. for loops
# 12. while loops
# 13. range function
# 14. list comprehension
# 15. functions
# 16. lambda expressions
# 17. map functions
# 18. filter functions
# 19. methods
# -----------------------------------------------
#numbers : 
# 1. int
# 2. float
# type() : to know the type of the variable
# plus : +
# minus : -
# multiply : *
# divide : /
# power : **
# floor division : // example : 5//2 = 2
# modulo : % example : 5%2 = 1
# variables :
# snake_case = 1 
# -----------------------------------------------
# strings :
# single quotes : ' '
# double quotes : " "
# print("first : {x} , second : {y}".format(x="XXX",y="YYY"))
# print(f" {x} {y} ") 
#-----------------------------------------------
# lists  or arrays :
# my_list = [1,2,3]
# my_list =[ "aaa", "bbb"]
# my_list = [1,2,3,[4,5]]
# my_list = ["string",1,2,3,4.5,True,"string2",[1,2,3]]
# my_list = [a,b,c]
# my_list = my_list[0]
# my_list = my_list[2] or my_list[-1]
# my_list[0] = "new"  # change the value of the first element
# my_list.append("d") # add new element to the end of the list
# my_list.pop() # remove the    last element
# my_list.pop(0) # remove the first element
# my_list[3][0] # to access the first element of the nested list
# my_list = ["a","b","c"]  
# my_list.sort() # sort the list    ( ttkhrj lina les valeurs kamlin )  
# my_list.reverse() # reverse the list
#-----------------------------------------------
# dictionaries or hash tables :
# my_dict = {"key1":"value1","key2":"value2"}
# my_dict =  d["key1"] # to access the value of the key1
# les dictionnaore ne sont pas ordonnées  , ils sont basés sur les clés
# my_dict.keys() # to get all the keys
# my_dict.values() # to get all the values
# my_dict.items() # to get all the items ( tt3tina les clés w les valeurs )
#if we want to add an element to the dictionary :   
# my_dict["key3"] = "value3"
#-----------------------------------------------
# Booleans or logical values :
# True or False
#-----------------------------------------------
# Tuples  OR immutable lists ( z3ma les valeurs mabghinach nmodifiw ):
# my_tuple = (1,2,3)
# my_tuple = ("a","b","c")
# my_tuple = ("a",1,2,3,4.5,True,"string2",[1,2,3])
# my_tuple[0] # to access the first element
# my_tuple[0] = "new" # error bcz tuples are immutable (mtytbdloch b7al CONST F c++ ola  java )
#-----------------------------------------------
#sets ( dictinaires without values :) ) : 
# my_set = {1,2,3} 
# my_set.add(2) # error bcz sets don't accept duplicates
# my_set.add(4) # add new element
# my_set.remove(3) # remove element
# my_set.discard(3) # remove element
# my_set.clear() # remove all elements
# my_set = {1,2,3,4,5,6}
# my_set2 = {1,2,3,4,5,6,7,8,9}
# my_set.union(my_set2) # to get the union of the two sets
# my_set.intersection(my_set2) # to get the intersection of the two sets
# my_set.difference(my_set2) # to get the difference of the two sets
# my_set.symmetric_difference(my_set2) # to get the symmetric difference of the two sets
#-----------------------------------------------
# comparaison operators :
# == , != , > , < , >= , <=
#-----------------------------------------------
# logical operators :
# and , or , not
# and --> &
# or --> |
# not --> !
#-----------------------------------------------
# if , elif , else  ( les conditions ) ,
# if  we have only one condition : then else
# if we have more than one condition : then elif else
# -----------------------------------------------
# for loops ( les boucles ):
# seq =  [1,2,3,4,5 ]
# for item in seq : ( item is a variable , t9der tbdelha smiya )
# print(item)
#-----------------------------------------------   
# while loops ( les boucles ):
# i = x
# while i < x :
# print(f"i is : {i}")
# i = i + 1
# la boucle ttb9a ttwsl lwa7d valeur < x
#-----------------------------------------------
# range function :
# range(5) # 0,1,2,3,4
# range(1,5) # 1,2,3,4
# range(1,5,2) # 1,3 why outpot = 1,3 ? bcz the third parameter is the step
#----------------------------------------------- 
# list comprehension :
# x = [1,2,3,4]
# out = []  
# for item in x :
# out.append(item**2)
# print(out)
# output : [1,4,9,16]
#-----------------------------------------------
# x = [1,2,3,4] 
# out = [item**2 for item in x] # list comprehension
# print(out)
# output : [1,4,9,16]
#-----------------------------------------------
# functions simple :
# def my_fucn() : 
# print("hello")    
# my_func() # call the function 
# output : hello
#-----------------------------------------------  
# functions with parameters :
# def my_func(name) :
#     name  = input("enter your name : ")	
#    print( "hello " + name)
# my_func(name ) # call the function
# output : hello name
#-----------------------------------------------
# functions with default parameters :
# def my_func(name = "default") :
#    name  = "hello " + str(input("enter your name : "))
#    print(name)
# my_func(name ) # call the function
# output : hello name
#-----------------------------------------------
# functions with return :
# def square(x) :
#   return x**2   
# out = square(2)
# print(out)
# output : 4   
# the return function is used to store the result of the function in a variable
#-----------------------------------------------
# when i use print in a function , i can't store the result of the function in a variable
#-----------------------------------------------
# lambda expressions :
# lambda   var : var**2 
# just one line of code , we use it one time
#-----------------------------------------------
# map  functions :
# seq = [1,2,3,4,5]
# list(map(lambda var : var**2 , seq))
# output : [1,4,9,16,25]
#-----------------------------------------------
# filter functions :
# seq = [1,2,3,4,5]
# list(filter(var:var%2 == 0 ,seq))
# output : [2,4]
#-----------------------------------------------
#difference between map and filter :    
# map : apply the function on all the elements of the list  
# filter : apply the function on the elements of the list and return the elements that satisfy the condition
#-----------------------------------------------
# var  = "hello my name is Kernel"
# var.lower() # convert to lower case
# var.upper() # convert to upper case
# var.split() # split the string to a list  
# Example :
# comment = " Go to gym"
# var = comment.split()
# print(var)
# output : ['Go', 'to', 'gym']
# print(var[0])
# output : Go
# print (var[0][0])
# output : G
#-----------------------------------------------
# d = {"k1":"v1","k2":"v2"}
# d.keys() # to get all the keys
# d.items() # to get all the items
# d.values() # to get all the values
#-----------------------------------------------
# list = [1,2,3,4,5]
# list.pop() # remove the last element
# list.pop(0) # remove the first element
# list.append(6) # add new element to the end of the list
# list.sort() # sort the list   ( ttkhrj lina les valeurs kamlin )
# list.reverse() # reverse the list
#- ---------------------------------------------
# exercice  : 
# go to this url  : https://colab.research.google.com/drive/11L6YLPGdcCNX2I4D5uqATmqTGf2FIkln#scrollTo=SkJ7FzqX3M9d
# go to this url  : https://exercism.org/tracks/python/exercises
