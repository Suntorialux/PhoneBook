package Phonebook;

/**
 * Created by Андрей on 27.06.2015.
 */
public class Phonebook {
    public int Id;
    public String Name;
    public String Second_Name;
    public int Number_Phone;

    public Phonebook() {}

    public Phonebook(int id, String name, String second_Name, int number_Phone) {
        Id=id;
        Name = name;
        Second_Name = second_Name;
        Number_Phone = number_Phone;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSecond_Name() {
        return Second_Name;
    }

    public void setSecond_Name(String second_Name) {
        Second_Name = second_Name;
    }

    public int getNumber_Phone() {
        return Number_Phone;
    }

    public void setNumber_Phone(int number_Phone) {
        Number_Phone = number_Phone;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Second_Name='" + Second_Name + '\'' +
                ", Number_Phone=" + Number_Phone +
                '}';
    }
}
