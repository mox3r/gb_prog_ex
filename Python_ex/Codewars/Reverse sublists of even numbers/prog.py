def rev_sub(arr):
    res, tmp = [], []
    for x in arr:
        if x % 2:
            res = res + tmp + [x]
            tmp = []
        else:
            tmp = [x] + tmp
    return res + tmp


print(rev_sub([4, 2, 4, 6, 66, 44, 32, 22, 13, 4, 6]))
