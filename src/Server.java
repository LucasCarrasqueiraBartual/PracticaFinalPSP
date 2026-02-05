import utils.RSA_Asimetric;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.KeyPair;

public class Server {

    private static KeyPair keys;

    static void main() throws Exception {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Servidor escuchando...");

        Socket socket = serverSocket.accept();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

        keys = RSA_Asimetric.randomGenerate(32);

        out.writeObject(keys.getPublic());
        out.flush();
    }

}
