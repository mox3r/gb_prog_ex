def TOS(string):
    return ''.join(
        str(i) if c.lower() in 'aeiou' else c for i, in enumerate(string, 1))


print(TOS("this is my string"))
