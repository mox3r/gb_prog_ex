import os
from time import sleep

f_name = r'data.txt'


def guide_reader(data_name):
    with open(data_name, 'r', encoding='utf8') as data:
        for line in data:
            print(line.strip())


def guide_write(data_name):
    str_surname = input('Фамилия: ')
    str_name = input('Имя: ')
    str_fname = input('Отчество: ')
    str_phone = input('Телефон: ')

    new_guide_str = '\n' + str_surname + '\t' + str_name + '\t' + str_fname + '\t' + '\t' + str_phone

    with open(data_name, 'a', encoding='utf8') as data:
        data.write(new_guide_str)


def guide_finder(data_name):
    item = input('Значение: ')
    with open(data_name, 'r', encoding='utf8') as data:
        for line in data:
            if item.lower() in line.lower():
                print(line.strip())


def guide_finder_pro(data_name):
    item_type = int(
        input('Выберите где искать:\n' + '0. Фамилия\n' + '1. Имя\n' +
              '2. Отчество\n' + '3. Телефон\n' + 'Выбор: '))
    item = input('Значение: ')

    with open(data_name, 'r', encoding='utf8') as data:
        for line in data:
            line = line.split()
            if item.lower() == line[item_type].lower():
                print(*line)


while True:
    os.system('cls' if os.name == 'nt' else 'clear')

    print('Телефонный справочник')
    print('1 - Вывести справочник\n' + '2 - Создать новую запись\n' +
          '3 - Поиск\n' + '4 - Расширенный поиск\n'
          'q - Выйти из программы. ')
    choise = input('Выберите действие: ')

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
        guide_finder_pro(f_name)
        input('Нажмите ВВОД чтобы продолжить')
    elif choise == 'q' or choise == 'Q':
        break
    else:
        print('Я ваще хз что ты хочешь')
        sleep(1)
