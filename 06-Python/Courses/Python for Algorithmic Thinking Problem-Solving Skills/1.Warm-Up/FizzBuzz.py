"""
- Fizz Buzz is a game for two or more players
- Take it in turns to count alound from 1 to 100 , but each time you are going to say a multiple of 3
, replace it with the word"fizz
- For multiple of 5 say "Buzz"
- for multiple of 3 and 5 say fizz, buzz
"""

count =  range(1,101) 

for i in count : 
    if i % 15 == 0 :
        print("Fizz , Buzz")
    elif i % 3 == 0 :
        print("fizz")
    elif i % 5 == 0 :
        print("Buzz")
    else : 
        print(i)
