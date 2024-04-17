package mutilThread_web;

import java.io.*;

public class test {

    public static void main(String[] args) {

        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("example.txt"), "UTF-8")) {
            osw.write("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("example.txt"), "UTF-8");
                BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
};
