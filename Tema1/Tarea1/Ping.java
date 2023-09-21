package org.example;

public class Ping {
    public static void processCreator(String programa){
        ProcessBuilder processBuilder = new ProcessBuilder("ping" ,programa);
        try {
            processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            Process process=processBuilder.start();
            process.waitFor();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        processCreator("google.com");

    }
}
