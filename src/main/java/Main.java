import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        BooleanSearchEngine engine = new BooleanSearchEngine(new File("pdfs"));
        System.out.println(engine.search("бизнес"));


        try (ServerSocket server = new ServerSocket(ServerConfig.PORT)) {
            System.out.println("Сервер запущен");
            while (true) {
                try (
                        Socket socket = server.accept();
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        PrintWriter writer = new PrintWriter(socket.getOutputStream(),true)
                ) {

                    System.out.println("Подключен клиент " + socket.getPort());
                    writer.println("Введите слово для поиска: например 'бизнес'");
                    writer.println(engine.search(reader.readLine()));

                }
            }

        } catch (IOException e) {
            System.out.println("Не могу стартовать сервер");
            e.printStackTrace();
        }


    }
}