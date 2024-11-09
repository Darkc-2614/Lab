/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio__1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
public class Laboratorio__1 {
    public static void main(String[] args) {
        chat frame = new chat();
        frame.setVisible(true);
        frame.setSize(766, 536);
        frame.setTitle("Ollama Chatbot");
        try {
            //http://localhost:11434
            URL url = new URL("http://localhost:11434");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            int respuesta = con.getResponseCode();
            if (respuesta != 200) {
                throw new RuntimeException("Ocurrió un error: " + respuesta);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();
                System.out.println(informationString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
