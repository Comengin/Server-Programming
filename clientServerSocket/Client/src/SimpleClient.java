import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class SimpleClient extends Thread{

    public int amountOfClient;
    public int correct;
    @Override
    public void run() {
        synchronized (this) {
            try {
                Socket s = new Socket("localhost", 8000);
                Scanner sc = new Scanner(System.in);

                //amount of active client
                PrintWriter prwrt = new PrintWriter(s.getOutputStream());
                prwrt.println(amountOfClient);
                prwrt.flush();

                //question sent by server
                InputStreamReader inn = new InputStreamReader(s.getInputStream());
                BufferedReader bff = new BufferedReader(inn);
                String strr = bff.readLine();
                System.out.println("Question: " + strr);

                //answer of client
                PrintWriter pr = new PrintWriter(s.getOutputStream());
                System.out.println("Answer of question: ");
                pr.println(sc.next());
                pr.flush();

                //message from server
                InputStreamReader in = new InputStreamReader(s.getInputStream());
                BufferedReader bf = new BufferedReader(in);
                String str = bf.readLine();
                System.out.println("Server: " + str);

                //to see the correctness of answers
                InputStreamReader inpt = new InputStreamReader(s.getInputStream());
                BufferedReader bfrd = new BufferedReader(inpt);
                String strg = bf.readLine();
                if (strg.equals("false"))
                    correct=0;
                else
                    correct=1;
                bfrd.close();
                bff.close();
                bf.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
            notify();
        }
    }
}