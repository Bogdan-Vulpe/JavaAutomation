package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {


    // structuri alternative =if-then-else; switch-case
    @Test
    public void metodaTest() {
//        metodaComparatieNumar(1000);
//        metodaComparatieNumar(-6);
//        metodaComparatieNumar(5);
        metodaverificareNumarParPozitiv(-7);

    }

    // Verificam un numar mai mare ca 5

    public void metodaComparatieNumar(int valoare) {
        if (valoare > 5) {
            System.out.println("Numarul " + valoare + " este mai mare decat 5");
        } else if (valoare < 5) {
            System.out.println("Numarul " + valoare + " este mai mic decat 5");
        } else {
            System.out.println("Numarul este egal cu 5");
        }
    }


    //verificam daca un numar e par pozitiv sau par negativ
    public void metodaverificareNumarParPozitiv(int valoare) {
        if (valoare > 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numar este par pozitiv ");
            } else {
                System.out.println("Numarul este impar pozitiv");
            }
        }
        else if (valoare < 0) {
                if (valoare % 2 == 0) {
                    System.out.println("Numar este par negativ");
                } else {
                    System.out.println("Numarul este impar negativ");
                }
            }
else {
            System.out.println("Numar egal cu zero");
        }
        }

    }









