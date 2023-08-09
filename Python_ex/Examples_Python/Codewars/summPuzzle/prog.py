def v (vars):
    return sum(ord(c) - 96 for c in vars.split("+"))
 
print(v('°+©'))