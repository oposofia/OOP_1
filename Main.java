package OOP;
/*
Проанализировать персонажей "Крестьянин, Разбойник, Снайпер,
Колдун, Копейщик, Арбалетчик, Монах". Для каждого определит
8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов
атаковать, вылечить итд). Создать абстрактный класс и иерархию
наследников.
Алексей Семенов Я не говорю
 */

/* Крестьянин:
 - Здоровье
 - Сила
 - Ловкость
 - Выносливость
 - Вид оружия
 - Уровень
 - ID
 - Имя

 Крестьянин:
 - Здоровье
 - Сила
 - Ловкость
 - Выносливость
 - Вид оружия
 - Уровень
 - ID
 - Имя

 Снайпер:
 - ID
 - Имя
 - Здоровье
 - Сила
 - Ловкость
 - Выносливость
 - Вид оружия
 - Меткость
 - Маскировка

 Колдун:
- ID
 - Имя
 - Здоровье
 - Интеллект
 - Выносливость
 - Вид оружия

 Копейщик:
 - ID
 - Имя
 - Здоровье
 - Интеллект
 - Выносливость
 - Вид оружия
 - Защита

 Арбалетчик:
 - ID
 - Имя
 - Здоровье
 - Выносливость
 - Вид оружия
 - Меткость
 - Количество стрел

 Монах:
 - ID
 - Имя
 - Здоровье
 - Интеллект
 - Вид оружия
 - Вера
 - Чакра
 - Выносливость

 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Charaсter> list = new ArrayList<>();
        list.add(new Monk("Ivan", "male"));
        list.add(new Crossbowman("Kira","female"));
        list.add(new Sniper("Igor","male"));
        list.add(new Peasant("Semen"));
        list.add(new Rogue("Kirill", "knife"));
        list.add(new Spearmen("Roman"));
        list.add(new Wizard("Svyatozar"));
        list.forEach(n->n.print());
    }
}