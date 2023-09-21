package org.example;

public class Text {
    public static void processCreator(String programa){
        ProcessBuilder processBuilder = new ProcessBuilder("cat" ,programa);
        try {
            processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            Process process=processBuilder.start();
            process.waitFor();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        processCreator("/home/dam2/Escritorio/text.txt");

    }
}