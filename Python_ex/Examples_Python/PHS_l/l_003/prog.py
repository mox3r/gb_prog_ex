# Операторы условий
# x = 0
# if x == 0:
#     print('if')
# elif x > 0:
#     print('elif')
# else:
#     print('else')

# x = 'a'

# if x == 0:
#     print('Ошибка! На ноль делить нельзя!')
#     x = 1
# elif type(x) == type(5) or type(x) == type(5.5):
#     print('Допустимое значение!')
# else:
#     print("Недопустимый тип данных!")
#     x = 1

# print(100 / x)
import os

site = input()
if 'https://' in site:
    os.system('start ' + site)
elif 'www.' in site:
    site = 'https://' + site
    os.system('start ' + site)
else:
    site = 'https://www.' + site
    os.system('start ' + site)
