package oop;

public class User {
//  pola -> zmmienne i obiekty
String name;
String lastName;
char gender;
boolean activated;
double salaryNet;
// konstruktor klasy -> metoda ktora jest wywolywana podczas tworzenia obiektu


    public User() {
    }

    public User(String name, String lastName, char gender, boolean activated, double salaryNet) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.activated = activated;
        this.salaryNet = salaryNet;
    }

    // metoda bezargumentowa nie zwracająca żadnej wielkosci -> "typu void"
    void printUser(){

        System.out.printf(
                "|%10s|%10s|%3c|%6b|%8.2fzł|\n",
                this.name, this.lastName, this.gender, this.activated, this.salaryNet); // this wsazuje na obiekt globalny
    }
//    metoda zwracajaca wartosc
    double calculateSallaryGross(){
        double sallaryGross = salaryNet * 1.23;
        return sallaryGross;
        }
        String modifyUserParameters(double salaryNet, boolean activated){
        this.salaryNet = salaryNet;
        this.activated= activated;
        return String.format("|%10s|%10s|%3c|%6b|%8.2fzł|\n",
            this.name, this.lastName, this.gender, this.activated, this.salaryNet);
        }
    }

