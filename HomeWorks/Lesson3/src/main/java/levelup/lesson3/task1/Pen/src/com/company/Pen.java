package com.company;

/// Задание 1. Принципы ООП, простейшие классы и объекты
// Разработайте спецификацию и создайте класс Ручка (Pen).
// Определите в этом классе методы equals(), hashCode() и toString().

public class Pen {
    int price;
    String Brand;
    String Model;
    // конструктор
    public Pen(int price, String Brand, String Model) {
        this.price = price;
        this.Brand = Brand;
        this.Model = Model;
    }
    // сравнивает между собой два объекта класса Pen
    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) return false;  //сравнение классов
        else {
            Pen pen = (Pen) obj;
            if ((price == pen.price) & (Brand == pen.Brand) & (Model == pen.Model) ) return true;
            else return false;
        }
    }
    // возвращает хэш-код объекта класса Pen
    @Override
    public int hashCode() {
        return  (price + ((null == Brand) ? 0 : Brand.hashCode()) + ((null == Model) ? 0 : Model.hashCode()));
    }
    // выводит в строку содержимое объекта класса Pen
    public String toString() {
        return getClass().getName() + "; price: " + price + "; Brand: " + Brand + "; Model: " + Model;
    }
}
