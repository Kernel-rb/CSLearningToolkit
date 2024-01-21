def mutate_string(string, position, character) -> str:
    new = list(string)
    new[position] = character
    string = "".join(new)
    return string

if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)

    