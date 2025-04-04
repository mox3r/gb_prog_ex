import os
from pathlib import Path
# colors = ['red', 'green', 'blue']
# data = open('file.txt', 'a')  # открытие файла и режим работы с ним
# data.writelines(colors) # разделителей не будет
# data.close()

file_path = Path('info', 'data.txt')
# file_path = r'info\file.txt'
with open(file_path, 'w', encoding='UTF-8') as data:
    data.write('ВАСЯ\n')
    data.write('Андрей\n')

with open(file_path, 'r', encoding='utf-8') as data:
    for line in data:
        print(line.strip())
