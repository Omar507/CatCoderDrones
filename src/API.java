import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class API {
    public void send()  {
//        ServerSocket serverSocket = new ServerSocket(8081);

        Socket socket = null;
        try {
            socket = new Socket("0.0.0.0", 8080);
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("STATUS 0");

            InputStream input = socket.getInputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

