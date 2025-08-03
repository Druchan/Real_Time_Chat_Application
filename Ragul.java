
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ragul extends Frame implements Runnable, ActionListener {
    TextField textField;
    TextArea textArea;
    Button Send;

    Socket socket;
    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;
    Thread chat;

    Ragul(){
        textField = new TextField();
        textArea = new TextArea();
        Send = new Button("Send");

        Send.addActionListener(this);

        try {

            socket = new Socket("Localhost",11002);

            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {

        }

        add(textField);
        add(textArea);
        add(Send);

        chat = new Thread(this);
        chat.setDaemon(true);
        chat.start();

        setSize(500,500);
        setTitle("Ragul");
        setLayout(new FlowLayout());
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = textField.getText();
        textArea.append("Ragul: "+ msg + "\n");
        textField.setText("");

        try {
            dataOutputStream.writeUTF(msg);
            dataOutputStream.flush();
        } catch (IOException ex) {
        }
    }

    public static void main(String[] args) {
        new Ragul();
    }

    @Override
    public void run() {
        while (true){
            try {
                String msg = dataInputStream.readUTF();
                textArea.append("Dru: " + msg + "\n");
            } catch (Exception e) {

            }
        }
    }
}

