import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class SimpleServer extends Thread {

    int id;
    String answer;
    String question;
    private Socket server;

    public  SimpleServer(Socket server){
        this.server=server;
    }
    @Override
    public void run(){
        try{
            //amount of clients
            InputStreamReader instr = new InputStreamReader(server.getInputStream());
            BufferedReader bfread = new BufferedReader(instr);
            int amount = bfread.read()-48;
            DB client = new DB(amount);
            id = client.getId();
            answer = client.getAnswer();
            question = client.getQuestion();


            System.out.println("Question: " + question);

            PrintWriter prr = new PrintWriter(server.getOutputStream());
            prr.println(question);
            prr.flush();

            InputStreamReader in = new InputStreamReader(server.getInputStream());
            BufferedReader bf = new BufferedReader(in);
            String str = bf.readLine();
            System.out.println("Answer of client: " + str);

            PrintWriter pr = new PrintWriter(server.getOutputStream());
            System.out.print("Message: ");
            if(str.equalsIgnoreCase(answer)){
                System.out.println("the client answered the question correctly.");
                pr.println("your answer is true, so you continue the game...");
                pr.flush();
            }
            else{
                System.out.println("the client did not answer the question correctly. Game is over!");
                pr.println("your answer is false...Right answer is " + answer+". Game is over for you!!!");
                pr.flush();
            }
            PrintWriter prwrt = new PrintWriter(server.getOutputStream());
            if(str.equalsIgnoreCase(answer)){
                prwrt.println("true");
                prwrt.flush();
            }
            else{
                prwrt.println("false");
                prwrt.flush();
            }
            bfread.close();
            bf.close();
            server.close();
        }
        catch(Exception e){
            e.printStackTrace(System.out);
        }
    }
}