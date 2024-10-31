"""
-   Classes mohimin , bcz some datascturcture tyt9ado b classes
-   when u create u own class == u create your own data type
"""

class Cookie : 
    def __init__(self , color , marque) -> str:
        self.color = color
        self.marque = marque
    def get_color(self) : 
        return self.color 
    def set_color(self , color) -> str   : 
        self.color = color

    def get_marque(self) -> str:
        return self.marque
    def set_marque(self, marque) -> str :
        self.marque = marque

cookie_one = Cookie("Brown" , "Nutella")
cookie_two = Cookie("Green"  , "Milka")

print(f" the color of  the first  coockie is :{cookie_one.get_color()} and his marque is :{cookie_one.get_marque()}")
print(f" the color of  the second coockie is  : {cookie_two.get_color()} and his marque is : {cookie_two.get_marque()}")

cookie_one.set_color("yellow")
print(f" the color of  the first  coockie is now : {cookie_one.get_color()} ")
print(f" the color of  the second coockie still the same :  {cookie_two.get_color()} ")

# Example
class LinkedList : 
    def __init__(self , value):
        pass
    def append(self, value):
        pass
    def pop(self):
        pass
    def prepend(self , value ):
        pass
    def insert(self , index, value ): 
        pass
    def remove(self, index ) :
        pass