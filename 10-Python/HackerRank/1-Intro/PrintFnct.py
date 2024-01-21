import sys
if __name__ == '__main__':
    n = int(input())
    if n == 1:
        print(1)
    else:
        print(*range(1,n+1,1), sep='', end='\n', file=sys.stdout)