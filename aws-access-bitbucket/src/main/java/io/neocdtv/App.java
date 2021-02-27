package io.neocdtv;

public class App {

    public static void main(String[] args) {
        if (args.length > 0) {
            if (args[0].equals("full")) {
                FullS3Test.start();
            }
            if (args[0].equals("read")) {
                ReadS3Test.start();
            }

        } else {
            System.out.printf("read or full required");
        }
    }
}