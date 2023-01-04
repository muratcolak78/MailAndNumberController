package com.example.mailandnumbercontroller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsThisMailAdress {
    private String adress;

    private List<String> keyWords;
    private List<String> keyWords2;
    private String warming;
    private List<String> warm=new ArrayList<>();

    public String getWarming() {
        return warming;
    }

    public String setWarming(String warming) {
        this.warming = warming;
        return warming;
    }

    public IsThisMailAdress() {
        this.adress = adress;
        this.keyWords = Arrays.asList("@", "mail.com");
        this.keyWords2 = Arrays.asList("@gmail.com", "@hotmail.com", "@yahoo.com", "@outlook.com");
    }

    public boolean lastTest(String test) {
        this.adress = test;
        if (!firstTest(this.adress)) return false;
        if (!secondTest()) return false;
        if (!thirdTest()) return false;
        else  this.warming="\nBu bir mail adresi...";
        return true;
    }

    public boolean firstTest(String test) {
        int counter = 0;
        this.adress = test;

        for (int i = 0; i < this.keyWords.size(); i++) {
            if (this.adress.contains(this.keyWords.get(i))) {
                counter++;
            }
        }
        if (counter == this.keyWords.size()) {
            warm.add("\n@ ve mail.com karakterlerden "+counter+" tane barindiriyor.... ");
            return true;
        }

        warm.add("\n@ ve mail.com karakterlerini barindirmiyor.. \nBu bir mail adresi degil...");
        return false;
    }

    public boolean secondTest() {
        int counter = 0;
        for (int i = 0; i < this.adress.length(); i++) {
            if (this.adress.contains(" ")) {

                counter++;
            }
        }

        if (counter == 0) {
            this.warming="\nAdreste bos karakter yok...";
            return true;
        } else {
            warm.add("\nAdreste bosluk karakteri var bu bir mail adresi olamaz...");
            return false;
        }

    }

    public boolean thirdTest() {
        int counter = 0;
        for (int i = 0; i < this.keyWords2.size(); i++) {
            if (this.adress.contains(this.keyWords2.get(i))) {
                counter++;
            }
        }
        if (counter == 1) {
            warm.add("\nTemel adreslerden biri var... ");
            return true;
        } else {
            warm.add("\nTemel adreslerden biri yok... ");
            return false;
        }
    }

    @Override
    public String toString() {
String text="";
        for(String t:warm)
            text=text+ t;
        return text;
    }
}
