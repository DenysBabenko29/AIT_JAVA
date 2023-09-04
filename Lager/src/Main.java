import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(List.of(
                new Person("Стукалина Есения", 7),
                new Person("Стукалина Ивона", 7),
                new Person("Шопран Тимофей", 12),
                new Person("Белый Илья", 12),
                new Person("Непочатов Олег", 10),
                new Person("Матвеева Кристина", 6),
                new Person("Бондарюк Амилия", 7),
                new Person("Нешпор Анастасия", 7),
                new Person("Олашин Богдан", 6),
                new Person("Новоселова Оксана", 6),
                new Person("Войланович Анита", 6),
                new Person("Павленко Давид", 6),
                new Person("Проскуркин Михаэль(Михаил)", 7),
                new Person("Проскуркина Асия", 8),
                new Person("Зорянская Кира", 8),
                new Person("Олашин София", 9),
                new Person("Нешпор Надия", 9),
                new Person("Маляр Юля", 8),
                new Person("Лунёва Елиза", 8),
                new Person("Тетерятников Рувим", 8),
                new Person("Дзгоев Назар", 9),
                new Person("Онофрийчук Марк", 9),
                new Person("Мандрийчук Максим", 9),
                new Person("Кацило Егор", 10),
                new Person("Волкова Диана", 10),
                new Person("Горобченко Дима", 10),
                new Person("Проскуркин Максим", 10),
                new Person("Онофрийчук Анастасия", 12),
                new Person("Ткаченко Вероника", 12),
                new Person("Онофрийчук София", 11),
                new Person("Волкова Валерия", 12),
                new Person("Нешпор Вера", 10),
                new Person("Пащенко Алиса", 11),
                new Person("Шило София", 11),
                new Person("Онофрийчук Катя", 11),
                new Person("Войланович Аким", 11),
                new Person("Шило Влад", 12),
                new Person("Дубич Костя", 12),
                new Person("Киричук Кристина", 12)));

        List<Person> newList = new ArrayList<>(List.of(
                new Person("Дюбарева София", 14),
                new Person("Павлено Эвелина", 14),
                new Person("Киричук Татьяна", 15),
                new Person("Беспорточна Лия(без ночевки)", 13),
                new Person("Беспорточна Ева(без ночевки)", 14),
                new Person("Фефилова Каролина", 13),
                new Person("Кравцова Диана", 13),
                new Person("Повельчук София", 13),
                new Person("Шило Надя", 14),
                new Person("Маляр Ира", 15),
                new Person("Онофрийчук Маша", 15),
                new Person("Ткаченко Маша", 16),
                new Person("Хусайнова Сабина", 16),
                new Person("Горобченко Алина", 16),
                new Person("Беспарточный Миша(без ночевки)", 12),
                new Person("Черниля Ярослав(без ночевки)", 15),
                new Person("Добровольский Артем", 13),
                new Person("Поливиченко Кирил", 14),
                new Person("Лунев Ярослав", 14),
                new Person("Новоселов Евген", 14),
                new Person("Кравцов Никита", 14),
                new Person("Романюк Роман", 14),
                new Person("Дунаенко Илья", 13),
                new Person("Тетерятников Эдуард", 15),
                new Person("Куровский Данил", 16),
                new Person("Новоселов Юрий", 13),
                new Person("Тетерятников Лев", 13),
                new Person("Вася", 16)

        ));
        System.out.println(newList.size());
        Collections.sort(newList);
        for (Person p : newList){
            System.out.println(p);
        }

    }




}
