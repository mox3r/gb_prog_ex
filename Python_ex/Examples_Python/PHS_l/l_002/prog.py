#Тиыпы данных
a = None
print(type(a))
a = 1
print(type(a))
a = 1.0
print(type(a))
a = 1.1j
print(type(a))
a = '1'
print(type(a))
a = [1, 2, 'a']
print(type(a))
a = {1, 2, 'a'}
print(type(a))
a = (1, 1, 'a')
print(type(a))
a = {'a': 1, 'b': 2}
print(type(a))
a = True
print(type(a))

x = input('Введите ')
print(type(x))
#z = x + 5 приведет к ошибке сложения стринга и инта
z = int(x) + 5 #приведение у к типу, в данном случае к инту
print("Результат", z)  