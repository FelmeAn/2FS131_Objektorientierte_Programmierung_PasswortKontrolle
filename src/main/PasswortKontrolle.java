package main;


import java.util.ArrayList;

public class PasswortKontrolle {
    private ArrayList<String> vocals = new ArrayList<String>();
    private ArrayList<String> replacement = new ArrayList<String>();
    //VARIABLEN
    private String password, benutzerName;

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
