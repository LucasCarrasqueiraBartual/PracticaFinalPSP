import utils.AES_Simetric;

import javax.crypto.SecretKey;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.security.PublicKey;

public class Client {

    static void main() throws Exception {

        Socket socket = new Socket("localhost", 5000);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

        PublicKey serverPublicKey = (PublicKey) in.readObject();

        SecretKey aesKey = AES_Simetric.keygenKeyGeneration(192);

    }
}
