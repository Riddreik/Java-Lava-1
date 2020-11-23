package bsu.rfe.java.group8.lab1.KhitevNS.var12;

public abstract class Food implements Consumable{
    String name = null;
    public Food(String name)   // конструктор инициализации
    {
        this.name = name;
    }
    public boolean equals(Object arg0)         // перегружен метод сравнения
    {
        if (!(arg0 instanceof Food)) return false;
        if (name == null || ((Food) arg0).name == null) return false;
        return name.equals(((Food) arg0).name);
    }

    public String toString()        // перегружен метод преобразования в строку
    {
        return name;
    }

    public String getName()        // возвращает имя
    {
        return name;
    }

    public void setName(String name)        // для изменения имени
    {
        this.name = name;
    }
    // Реализация метода consume() удалена из базового класса Food
// Это можно сделать, потому что сам Food - абстрактный
}
