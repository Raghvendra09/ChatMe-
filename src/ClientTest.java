import javax.swing.JFrame;

public class ClientTest {
public static void main(String[] args)
{
Client cle;
cle = new Client("127.0.0.1");
cle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
cle.startRunning();

}
}
