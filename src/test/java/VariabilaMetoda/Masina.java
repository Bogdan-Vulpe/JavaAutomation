package VariabilaMetoda;

import org.testng.annotations.Test;

public class Masina {


    public String marca;
    public String model;
    public Integer anulFabricatiei;

    @Test
    public void metodaTest(){
        dateMasina("Audi","Q3",2024);
        dateMasina("BMW","X6",2020);

        calculmedie(2.3,3.7);
        calculmedie(3.33,987.25);
    }



    public void dateMasina(String param1,String param2,Integer param3){
        marca= param1;
        model=param2;
        anulFabricatiei=param3;

        System.out.println("Marca masini este " +marca);
        System.out.println("Modelul masini este " +model);
        System.out.println("Anul fabricatiei este "+anulFabricatiei);
    }


    //Calculam media la doua numere

    public void calculmedie(Double nota1, Double nota2){
Double rezultat=(nota1+nota2)/2;
        System.out.println("Media celor 2 numere este: "+rezultat);
    }

}
