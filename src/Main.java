/*Задание 2 — обязательное

В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Один из сотовых операторов решил сделать своим клиентам приятный бонус: если клиент
пополняет счёт более чем на 1000 рублей, то сотовый оператор дарит ему по 1 рублю
за каждые полные 100 рублей пополнения.

Примеры. Начальные данные: у клиента на счету 100 рублей.

Клиент пополнил счёт на 300 рублей — бонусов нет, итоговая сумма на счету клиента — 400 рублей.
Клиент пополнил счёт на 1100 рублей — бонус равен 11 рублям,
итоговая сумма на счету клиента — 1211 рублей.

Нужно создать приложение, выводящее итоговый счёт и количество бонусных рублей.
Количество денег на текущем счету клиента и сумму пополнения вы выбираете
сами — создайте переменные, в которых эти данные будут храниться.

Приложение должно быть написано так, чтобы при замене значений переменных — начальной
суммы счёта и суммы пополнения — итоговый счёт и бонусные рубли рассчитывались правильно.*/


class Main {
    public static void main(String[] args) {

        int balance = 100; // Начальный баланс клиента
        int check = 1500; // Введите сумму пополнения баланса!
        int bonuses = check > 1000 ? check / 100 : 0; // Считаем количество бонусов

        /* int bonuses; // Либо сперва вводим переменную количества бонусов */

        /*if (check > 1000) { // Пишем условие для вывода бонусов
            bonuses = check / 100;
        } else {
            bonuses = 0;
        }*/

        System.out.println("Количество бонусов за пополнение счета: " + bonuses); // Выводим количество бонусов

        int finalBalance = balance + check + bonuses; // Вводим переменную итоговой суммы на счету клиента

        System.out.println("Итоговая сумма на счёте клиента: " + finalBalance); // Выводим итоговую сумму на счету клиента
    }
}
