import sys 
import math 


# si on a -n et n sont les valeurs les pluss proches de 0 on va prendre le n   (avec n > 0)
# les valeur appartient à l intervale [-273 , 5526]
# if  n = None => return 0 

t_pos = 5527
t_neg = -t_pos

n = int(input())
if n == 0:
    print(0)
    exit(0)

for i in input().split(): 
    t = int(i)
    print(t, file=sys.stderr ,flush=True)
    if t >= 0 : 
        if t < t_pos:
            t_pos = t
    else:
        if t > t_neg:
            t_neg = t


if t_pos <= abs(t_neg): 
        print(t_pos)
else: 
        print(t_neg)



