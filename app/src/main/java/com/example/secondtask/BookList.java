package com.example.secondtask;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private static final int countBook = 10;
    private static final String[] titles = {"Дары Волхвов", "Анна Каренина", "Аня из Зеленых Мезонинов", "Гордость и предубеждение", "451° по Фаренгейту", "1984", "Великий Гэтсби", "Мастер и Маргарита", "Преступление и наказание", "Три мушкетёра"};
    private static final String[] authors = {"О. Генри", "Лев Толстой", "Люси Мод Монтгомери", "Джейн Остин", "Рэй Брэдбери", "Джордж Оруэлл", "Фрэнсис Скотт Фицджеральд", "Михаил Булгаков", "Фёдор Достоевский", "Александр Дюма"};
    private static final String[] descriptions = {"Нежная трепетная история о великодушии, верности и умении радоваться жизни покорила сердце не одного поколения читателей.",
            "История всепоглощающей страсти, история замужней женщины, полюбившей красавца офицера и бросившей своего мужа наперекор всему.",
            "В результате ошибки сирота Аня попадает на ферму к брату и сестре. С течением времени удивительная девочка покоряет сердца всех ее жителей.",
            "Самый популярный женский роман, показывающий, что возможность распоряжаться своей жизнью по собственному усмотрению есть у каждого.",
            "Каким станет мир, если в нем не будет книг? Именно с таким обществом знакомит нас автор в своем произведении.",
            "Что, в сущности, страшнее: доведенное до абсурда \"общество потребления\" - или доведенное до абсолюта \"общество идеи\"?",
            "Герой романа - наивный мечтатель, вся жизнь которого - это стремление завоевать любовь одной девушки.",
            "История о похождениях дьявола и его свиты, которая превратилась в глубокую философскую притчу.",
            "Произведение Достоевского, в котором он выразил свой взгляд на природу человека, его назначение и законы, которым он подчинён как личность...",
            "Роман о любви и дружбе, о коварстве и предательстве, об отважных мужчинах и блистательных женщинах."};
    public static List<Book> getBookList() {
        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < countBook; i++)
        {
            Book book = new Book(titles[i], authors[i], descriptions[i]);
            check(i, book);
            bookList.add(book);
        }
        return bookList;
    }
    public static void check(int i, Book book)
    {
        if (i == 0) book.setImageResource(R.drawable.first);
        else if (i == 1) book.setImageResource(R.drawable.second);
        else if (i == 2) book.setImageResource(R.drawable.third);
        else if (i == 3) book.setImageResource(R.drawable.forth);
        else if (i == 4) book.setImageResource(R.drawable.fifth);
        else if (i == 5) book.setImageResource(R.drawable.sixth);
        else if (i == 6) book.setImageResource(R.drawable.seventh);
        else if (i == 7) book.setImageResource(R.drawable.eighth);
        else if (i == 8) book.setImageResource(R.drawable.ninth);
        else if (i == 9) book.setImageResource(R.drawable.tenth);
    }
}