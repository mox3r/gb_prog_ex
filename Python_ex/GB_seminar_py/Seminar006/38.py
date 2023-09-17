import os
from time import sleep
from pathlib import Path

# f_name = Path('GB_seminar_py', 'Seminar006', 'data.txt')
f_name = r'data.txt'
temp_name = r'temp.tmp'


def guide_reader(data_name):
    with open(data_name, 'r', encoding='utf8') as data:
        for line in data:
            print(line.strip())


def guide_writer(data_name):
    str_surname = input('Фамилия: ')
    str_name = input('Имя: ')
    str_fname = input('Отчество: ')
    str_phone = input('Телефон: ')

    new_guide_str = str_surname + ' ' + str_name + ' ' + str_fname + ' ' + str_phone + '\n'

    with open(data_name, 'a', encoding='utf8') as data:
        data.write(new_guide_str)


def guide_finder(data_name):
    item_type = int(
        input(
            'Поиск по:\n1 - фамилия\n2 - имя\n3 - отчество\n4 - телефон\nВыбор: '
        ))
    item = input('Значение: ')
    if item > 0 < 5:
        with open(data_name, 'r', encoding='utf8') as data:
            for line in data:
                line = line.split()
                if item.lower() in line[item_type - 1].lower():
                    print(*line)
    else:
        print("Ошибочка вышла!")


def guide_sort_by(data_name):
    list_1 = []
    item_type = int(
        input(
            'Введите тип сортировки\n 1 - фамилия\n 2 - имя\n 3 - отчество\n 4 - телефон\n Выбор: '
        ))
    with open(data_name, 'r', encoding='utf8') as data:
        for line in data:
            line = line.split(' ')
            list_1.append(line)
        list_1.sort(key=lambda person: person[item_type - 1])

    with open(data_name, 'w', encoding='utf8') as data:
        for item in list_1:
            item = ' '.join(item)
            data.write(item.strip() + '\n')


def guide_remover(data_name, temp_name):
    line_remove = input('Введите контакт для удаления: ')
    with open(data_name, 'r', encoding='utf8') as fin:
        for i in fin:
            if line_remove.lower() in i.lower():
                line_remove = i

    print(f'Контакт для удаления\n\n{line_remove}')
    ans = input(r'Подтвердить(Да\Нет)? ')
    if ans.lower() == 'да':
        with open(data_name, 'r', encoding='utf8') as fin:
            with open(temp_name, 'w', encoding='utf8') as fout:
                for line in fin:
                    if line_remove not in line:
                        fout.write(line)
        os.replace(temp_name, data_name)
    elif ans.lower() == 'нет':
        return 0


def guide_replacer(operation, data_name, temp_name):
    line_replace = input('Введите контакт для изменения: ')
    with open(data_name, 'r', encoding='utf8') as fin:
        for i in fin:
            if line_replace in i:
                line_replace = i

    print(f'Контакт для изменения\n{line_replace}\n')

    with open(data_name, 'r', encoding='utf8') as fin:
        with open(temp_name, 'w', encoding='utf8') as fout:
            for line in fin:
                if line_replace not in line:
                    fout.write(line)
    os.replace(temp_name, data_name)
    operation(data_name)


while True:
    os.system('cls' if os.name == 'nt' else 'clear')

    print('Телефонный справочник')
    print('1 - Вывести справочник\n' + '2 - Создать новую запись\n' +
          '3 - Поиск\n' + '4 - Сортировка\n' + '5 - Изменение записи\n' +
          '6 - Удаление записи\n' + 'q - Выйти из программы. ')
    choise = input('Выберите действие: ').lower()

    if choise == '1':
        guide_reader(f_name)
        input('Нажмите ВВОД чтобы продолжить')
    elif choise == '2':
        guide_writer(f_name)
        input('Нажмите ВВОД чтобы продолжить')
    elif choise == '3':
        guide_finder(f_name)
        input('Нажмите ВВОД чтобы продолжить')
    elif choise == '4':
        guide_sort_by(f_name)
        input('Нажмите ВВОД чтобы продолжить')
    elif choise == '5':
        guide_replacer(guide_writer, f_name, temp_name)
        input('Нажмите ВВОД чтобы продолжить')
    elif choise == '6':
        guide_remover(f_name, temp_name)
        input('Нажмите ВВОД чтобы продолжить')
    elif choise == 'q':
        break
    else:
        print('Я ваще хз что ты хочешь')
        sleep(1)
