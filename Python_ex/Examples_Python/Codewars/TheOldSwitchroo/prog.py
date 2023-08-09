def TOS(string):
    list(string)
    for x in range(len(string)):
        if(string[x] == 'a' or string[x] == 'e'
           or string[x] =='i' or string[x] == 'o'
           or string[x] == 'u'): string[x] = x+1
    return string

print(TOS("this is my string"))