# if a = k *3 or a = k *5 then print flzzBuzz
# if a = k*3 print FLzz
# if a = k * 5 print Buzz
# else print i


def fizzBuzz(n):
    x = range(0 , 2*10**5) 
    for i in x:
        if i % 3 == 0 or i % 5 == 0 : 
         print("FluzzBuzz") 
        elif i % 3 == 0 or i % 5 != 0 :  
            print("Flzz")
        elif i % 3 != 0 or i % 5 == 0 : 
            print("Buzz")
        else :
            print(i)
    
