a = int(input())
i = input()
arr= list(map(int, i.split()))
arr.sort()
print(arr[-1]*arr[-2])

