// 1. Creati o noua clasa HelloTutorial
// 2. Declarați o constantă float pentru a reprezenta valoarea lui PI (π = 3.1415926).
// calculați circumferinta unui cerc data raza, ce trebuie sa schimbam daca dorim sa avem maxima precizie suportata in java
// 3. Declarati doua numere intregi a si b. Ulterior dati valori si afisati rezultatul operatiei de scadere: B - A este: rezultat
// 4. Initializati 3 variabile de tip char cu valorile 'a', 'b' si 'c'
// 5. Initializati 3 variabile de tip boolean care sa reprezinte:
//  	- daca utilizatorul este autentificat corespunzator,
//  	- daca are un email verificat,
//  	- daca are permisiunea de a administra alte conturi
// Gasiti nume cat mai descriptive pentru variabile.
// 6. Initializati 4 variabile de tip intreg cu: 5, 84, 172, 38521. Apoi afisati pe ecran restul impartililor lor la 11

public class HelloTutorial {

    public static void main(String[] args) {
        final float PI = 3.1415926F;
        System.out.println("2.Valoarea pi folosita: " + PI);
        double razaCerc = 4.00;
        System.out.println("2. Raza cercului este: " + razaCerc);
        int A = 24;
        int B = 10;
        int x = B - A;
        System.out.println("3. B - A este: " + x);
        char model='a';
        char tip='b';
        char marca='c';
        System.out.println("4. 3 Variabile: " + model + tip + marca);
        boolean rightUser=true;
        System.out.println("5. Correct Logged In: " + rightUser);
        boolean goodEmail=false;
        System.out.println("5. Checked Email: " + goodEmail);
        boolean isAdmin=true;
        System.out.println("5. Admin: " + isAdmin);
        System.out.println("6. Restul impartiri 5 la 11 este: " + (5 % 11));
        System.out.println("6. Restul impartiri 84 la 11 este: " + (84 % 11));
        System.out.println("6. Restul impartiri 172 la 11 este: " + (172 % 11));
        System.out.println("6. Restul impartiri 38521 la 11 este: " + (38521 % 11));
    }

}
