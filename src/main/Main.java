package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gebe den Benutzernamen ein: ");
        PasswortKontrolle pc1 = new PasswortKontrolle(sc.nextLine());
        System.out.print("Bitte gebe das Passwort ein: ");
        if(pc1.pruefePasswort(sc.nextLine()))
            System.out.println("Das Passwort ist korrekt!");
        else
            System.out.println("Das Passwort ist falsch!");

        PasswortKontrolle pc2 = new PasswortKontrolle();
    }
}
