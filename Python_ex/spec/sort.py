import random
import json
from datetime import datetime

show = False
lst = False
tech_timer = False

dt_overall = datetime.now()

lst_range = 2**4
if (show): print(f'{lst_range}')

dt_lst_create0 = datetime.now()
list_to_sort = [random.randint(0, 1000) for _ in range(lst_range)]

if (tech_timer):
    print(f'List creation time: {datetime.now() - dt_lst_create0}')

if (show): print(f'{len(list_to_sort)}')
if (lst): print(list_to_sort)
if (show): print(f'Sorting')


def main():
    dt0 = datetime.now()

    list_to_sort.sort()

    if (show): print(f'Sorted')
    if (tech_timer): print(f'Sorting time: {datetime.now() - dt0}')

    dt_check = datetime.now()
    i = 0
    while i < (len(list_to_sort) - 1):
        if list_to_sort[i] > list_to_sort[i + 1]:
            print(f'FAIL!!')
            break
        i += 1

    if (lst): print(list_to_sort)

    with open('data.tmp', 'w') as data:
        json.dump(list_to_sort, data, indent=2)

    if (tech_timer): print(f'Check time: {datetime.now() - dt_check}')

    print(f'Execution time: {datetime.now() - dt_overall}\nDONE!')


if __name__ == "__main__":
    main()
