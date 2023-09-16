import os
from pathlib import Path

   

    
os.system('cls' if os.name == 'nt' else 'clear')
print('Телефонный справочник')
path_name = r'data.txt'
def guide_reader(file_name):
    with open(file_name, 'r', encoding='utf8') as data:
        data.read('Фамилия\tИмя\t\tТелефон')
    return print('Справочник создан')
        
