package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //clasa=sablon care defineste propietatile si comportamentul unei entitati specifice

    // intr-un fisiser java putem avea mai multe clase diferentiate pe baza numelui (nu este un practice bun sa avem mai multe clase cu acelasi nume)

    // intr-o clasa putem defini propietatile si actiunile entitati

    // variabila = propietatea unei clase

    // variabile pot fi de 2 feluri: global si local

    // variabilele globale = sunt vizibile peste tot in proiect
    // variabile locale = sunt vizibile doar in locul in care l-ai declarat
    // ca sa definim o variabila globala: accesscontrol (public) tip variabila nume variabila

    // in momentul in care defenim o variabila nu este obligatoriu sa ii dam o valoare

    // metoda = actiunea unei classe
    // exista 2 tipuri de metode: void si return

    public String Nume;


    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime;

    public Float Greutate;

    public Character Sex;

    public Boolean Arediploma;




    @Test
    public void prezentareStudent(){
        Nume="Briciu";
        Prenume="Alex";
        Varsta=41;
        Adresa="Victoriei";
        Inaltime=1.70;
        Greutate=76.35f;
        Sex='M';
        Arediploma=true;
//        System.out.println(Nume+ " "+Prenume+ " " + Varsta);
//        System.out.println(Adresa);
//        System.out.println(Inaltime);
//        System.out.println(Greutate+" "+Sex);
//        System.out.println(Arediploma);
        //test

        System.out.println("Numele studentului este:"+" "+ Nume);
        System.out.println("Prenume studentului este:"+" "+ Prenume);
        System.out.println("Varsta studentului este:"+" "+ Varsta);
        System.out.println("Adresa studentului este:"+" "+ Adresa);
        System.out.println("Inaltimea studentului este:"+" "+ Inaltime);
        System.out.println("Greutatea studentului este:"+" "+ Greutate);
        System.out.println("Numele studentului este:"+" "+ Sex);
        System.out.println("Are studentul diploma?"+" "+ Arediploma);




        calculMedie();


    }

    public void calculMedie(){
        Integer nota1=4;
        Integer nota2=6;
        Integer nota3=2;

        Integer medie=(nota1+nota2+nota3)/3;
        System.out.println("Media notelor este= "+medie);


    }


}
