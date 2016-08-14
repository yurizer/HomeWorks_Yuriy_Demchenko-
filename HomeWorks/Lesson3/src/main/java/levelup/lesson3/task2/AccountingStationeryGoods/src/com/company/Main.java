package com.company;


// Задача 2. Классы и объекты
// Напишите приложение, позволяющее вести учет канцелярских товаров на рабочем месте сотрудника.
// Определите полную стоимость канцтоваров у определенного сотрудника.

class Stationery {

    String productType;
    String brand;
    int amount;
    float price;
    // конструктор
    public Stationery(String productType, String brand, int amount, float price) {
        this.productType = productType;
        this.brand = brand;
        this.amount = amount;
        this.price = price;
    }
}
class Staff {

    int index;  // количество видов канцтоваров у одного сотрудника
    Stationery[] set;

    public Staff(int index) {
        this.index = index;
        this.set = new Stationery[index];
    }
    void printer() {
        System.out.println();
        for (int i = 0; i < index; i++) {
            System.out.println(set[i].amount + " " + set[i].productType + " of \"" + set[i].brand + "\" - " + set[i].price + " for each.");
        }
    }
    float totalPrice() {
        float p = 0;
        for (int i = 0; i < index; i++) {
            p = p + set[i].amount * set[i].price;
        }
        return p;
    }
}
public class Main {
    public static void main(String[] args) {
        Staff stSet = new Staff(3);
        stSet.set[0] = new Stationery("pen", "Pilot", 6, 2.15f);
        stSet.set[1] = new Stationery("paper", "Lazer", 2, 1.25f);
        stSet.set[2] = new Stationery("paints", "Trodat", 2, 2.14f);
        stSet.printer();
        System.out.println();
        System.out.println("Total stationery price: " + stSet.totalPrice());
    }
}
