"""
append => O(1)
pop => O(n)
prepend => O(1)
pop first => O(1)
insert => O(n)
remove => O(n)
lookup by index => O(n)
lookup by value => O(n)

node = {
    'value' :  4,
    'next '  : None   
}
"""


head = {
    "value" : 11 ,
    "next" : {
        "value" : 3 , 
        "next" : {
            "value" :23 ,
            "next": {
                "value" : 7 ,
                "next" : None 
            }
        }
    }
}

print(head["next"]["next"]["value"])