import os
from time import sleep
from pathlib import Path

# f_name = Path('GB_seminar_py', 'Seminar006', 'data.txt')
f_name = 'data.txt'


def guide_reader(data_name):
    with open(data_name, 'r', encoding='utf8') as data:
        for line in data:
            print(line.strip())


def guide_write(data_name):
    str_surname = input('Фамилия: ')
    str_name = input('Имя: ')
    str_fname = input('Отчество: ')
    str_phone = input('Телефон: ')

    new_guide_str = str_surname + ' ' + \
        str_name + ' ' + str_fname + ' ' + str_phone + '\n'

    with open(data_name, 'a', encoding='utf8') as data:
        data.write(new_guide_str)


def guide_finder(data_name):
    item = input('Значение: ')
    with open(data_name, 'r', encoding='utf8') as data:
        for line in data:
            if item.lower() in line.lower():
                print(line.strip())


def sort_by(data_name):
    list_1 = []
    item_type = int(input(
        'Введите тип сортировки\n 0 - фамилия\n 1 - имя\n 2 - отчество\n 3 - телефон\n Выбор: '))
    with open(data_name, 'r', encoding='utf8') as data:
        for line in data:
            line = line.split(' ')
            list_1.append(line)
        list_1.sort(key=lambda person: person[item_type])

    with open(data_name, 'w', encoding='utf8') as data:
        for item in list_1:
            item = ' '.join(item)
            data.write(item.strip() + '\n')


while True:
    os.system('cls' if os.name == 'nt' else 'clear')

    print('Телефонный справочник')
    print('1 - Вывести справочник\n' + '2 - Создать новую запись\n' +
          '3 - Поиск\n' + '4 - Сортировка\n'
          'q - Выйти из программы. ')
    choise = input('Выберите действие: ').lower()

    if choise == '1':
        guide_reader(f_name)
        input('Нажмите ВВОД чтобы продолжить')
    elif choise == '2':
        guide_write(f_name)
        input('Нажмите ВВОД чтобы продолжить')
    elif choise == '3':
        guide_finder(f_name)
        input('Нажмите ВВОД чтобы продолжить')
    elif choise == '4':
        sort_by(f_name)
        input('Нажмите ВВОД чтобы продолжить')
    elif choise == 'q':
        break
    else:
        print('Я ваще хз что ты хочешь')
        sleep(1)
