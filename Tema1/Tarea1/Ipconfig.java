package org.example;

public class Ipconfig {
    public static void processCreator(){
        ProcessBuilder processBuilder = new ProcessBuilder("ifconfig");
        try {
            processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            Process process=processBuilder.start();
            process.waitFor();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        processCreator();

    }
}
