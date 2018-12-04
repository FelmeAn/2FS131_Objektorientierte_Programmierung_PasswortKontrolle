package main;


import java.util.ArrayList;
import java.util.Scanner;

public class PasswortKontrolle {
    private ArrayList<String> vocals = new ArrayList<String>();
    private ArrayList<String> replacement = new ArrayList<String>();
    //VARIABLEN
    private String password, benutzerName;
    public PasswortKontrolle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gebe den Benutzernamen ein: ");
        benutzerName=sc.next();
        System.out.print("Bitte gebe das Passwort ein: ");
        if(pruefePasswort(sc.nextLine()))
            System.out.println("Das Passwort ist korrekt!");
        else
            System.out.println("Das Passwort ist falsch!");
    }
    public PasswortKontrolle(String benutzerName){
        this.benutzerName=benutzerName;
    }

    private void ermittlePasswort(){
        password=benutzerName;
        String[] s = new String[]{"a", "e", "i", "o", "u"};
        for(int i = 0; i<s.length; i++){
            vocals.add(s[i]);
            replacement.add(String.valueOf(i+1));
        }
        for(int i = 0; i<vocals.size(); i++){
            password=password.replace(vocals.get(i), replacement.get(i));
        }
    }

    public boolean pruefePasswort(String password){
        ermittlePasswort();
        if(password.equals(this.password))
            return true;
        return false;
    }



    //Kubernetes, Docker
}
