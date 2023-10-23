package com.rsbprojects;

public class Test {
    public static void main(String[] args) {
        Singleton lazy = Singleton.getInstance();
        System.out.println("\nProgram Started\nMemory Adress: "+lazy+"\nWorked =)\n");
    }
    
}
