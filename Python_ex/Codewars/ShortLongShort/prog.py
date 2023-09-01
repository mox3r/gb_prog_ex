def ShortLongShort(st, ls):
    s, l = str(st), str(ls)
    if len(s) <= len(l):
        return s + l + s
    else:
        return l + s + l


print(ShortLongShort(12))
