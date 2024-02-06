"""
Your task is to determine what Bob will reply to someone when they say something to him or ask him a question.

Bob only ever answers one of five things:

"Sure." This is his response if you ask him a question, such as "How are you?" The convention used for questions is that it ends with a question mark.
"Whoa, chill out!" This is his answer if you YELL AT HIM. The convention used for yelling is ALL CAPITAL LETTERS.
"Calm down, I know what I'm doing!" This is what he says if you yell a question at him.
"Fine. Be that way!" This is how he responds to silence. The convention used for silence is nothing, or various combinations of whitespace characters.
"Whatever." This is what he answers to anything else.
"""


# def response(hey_bob):
    
#     ch:bool = hey_bob.islower()
#     space :bool = hey_bob.isstripe()

#     if  "?" in hey_bob :
#         return 'Sure '
#     elif ch == False :
#         return "Whoa, chill out!"
#     elif "?" in hey_bob & ch == False :
#         return "Calm down, I know what I'm doing"
#     elif len(hey_bob) == 0 or space == True :
#         return 'Fine. Be that way!'
#     else : 
#         return "Whatever "
    

def cheacker(arg) -> bool:
    if arg.islower() == True :
        return "ra miniscule"
    elif arg.islower() == None:
        print("ra majusicile")
    else : 
        print("hadchi mkhdmach")

cheacker("SALAM")
cheacker("gfkgndlkfndglknfdgd")