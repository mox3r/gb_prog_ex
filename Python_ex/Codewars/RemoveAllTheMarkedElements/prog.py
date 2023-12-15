def remover(list_1, list_2):
    # list_3 =[]
    # for item in list_1:
    #     if item not in list_2:
    #         list_3.append(item)
    # return list_3
    return [i for i in list_1 if i not in list_2]


print(remover([1,1,1,1,1,3,3,2,24,1,1,12,23,1,1,1], [1,3]))
     