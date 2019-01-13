# Java test to ScaleApps
Calculation app for ScaleApps

# Задание
Тестовое задание
Написать консольное Java приложение, выполняющие набор заданных арифметических
операций.
Операции:
1) Сложение 2х и более чисел
2) Умножение 2х и более чисел
3) Умножение первых 2х чисел и сложение с 3м числом
Приложение может получать параметры либо из файла, либо вводом из консоли.
Приложение может выводить результат либо в файл, либо в консоль.
Режим работы определяется аргументами командной строки.
Если значение аргумента задано как "-", то это означает работу с консолью, иначе с файлом.
Примеры запуска с аргументами:
1) test-app - - <enter>
(в данном случае получение параметров из консоли и вывод в консоль)
> add 10 20 <enter>
> Ответ: 30
>
2) test-app input.txt output.txt <enter>
В файле input.txt строка:mul 1 2 3
В файле output.txt строка: 6
Результат желательно выложить на github.

# Описание
Программа работает с консолью при запуске с параметром "-". Иначе, работает с файлом.
Первое взодное значание определяет имя алгоритма для программы : add,mul,op (можно переопределить в интерфейсе CalcOperationsScaleApps).
Программа считывает все доступные входные значения типа Double, остальные пропускает. 
Вызывает необходимый алгоритм и выводит результат либо в файл, либо в консоль.
Файл настройки - config.properties. 