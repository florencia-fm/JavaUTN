package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
         final String regex = "(([a-z]|[0-9])+@[a-z]+\\-[a-z]+)";
         final String string = "ramonperez@gmail.com";

        System.out.println(string.matches(regex)); // string.matches(regex) devuelve true o false

        final String regex = ".* (([a-z]|[0-9])+@[a-z]+\\-[a-z]+).* ([0-9]+)$";
        final String string = "Maria es docente, su email es maria123@gmail.com y su DNI es 31605906";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        System.out.println(pattern.matcher(string).matches() ? "Coincide" : "No coincide"); // pattern.matcher(string).matches() devuelve true o false

        while(matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}