public class Client {
    public static void main(String[] args) throws InterruptedException {
        int isClient1=1;
        int isClient2=1;
        int isClient3=1;
        int isClient4=1;
        int check;
        while(true) {
            check=0;
            SimpleClient client1 = new SimpleClient();
            client1.amountOfClient=check;
            if(isClient1==1){
                System.out.println("*********First client*********");
                client1.start();
                synchronized (client1){
                    client1.wait();
                    if(client1.correct == 0)
                        isClient1=5;
                }
                check++;
            }
            else{
                System.out.println("First player lost the game!The next player is continuing...");
                client1.interrupt();
            }
            SimpleClient client2 = new SimpleClient();
            client2.amountOfClient=check;
            if (isClient2 == 1) {
                System.out.println("*********Second client*********");
                client2.start();
                synchronized (client2) {
                    client2.wait();
                    if (client2.correct == 0)
                        isClient2 = 5;
                }
                check++;
            }
            else {
                System.out.println("Second player lost the game!The next player is continuing...");
                client2.interrupt();
            }
            SimpleClient client3 = new SimpleClient();
            client3.amountOfClient=check;
             if (isClient3 == 1) {
                 System.out.println("*********Third client*********");
                 client3.start();
                 synchronized(client3){
                     client3.wait();
                     if (client3.correct == 0)
                         isClient3 = 5;
                 }
                 check++;
             }
             else{
                 System.out.println("Third player lost the game!The next player is continuing...");
                 client3.interrupt();
             }
            SimpleClient client4 = new SimpleClient();
            client4.amountOfClient=check;
            if (isClient4 == 1) {

                System.out.println("*********Fourth client*********");
                client4.start();
                synchronized (client4) {
                    client4.wait();
                    if (client4.correct == 0)
                        isClient4 = 5;
                }
            }
            else{
                System.out.println("Fourth player lost the game!The next player is continuing...");
                client4.interrupt();
            }
            if (isClient1 == 5  && isClient2 == 5 && isClient3 == 5 && isClient4 == 5) {
                System.out.println("Nobody is win!!!");
                break;
            }
            else if (isClient2 == 5 && isClient3 == 5 && isClient4 == 5) {
                System.out.println("First client is win!!!");
                break;
            }
            else if (isClient1 == 5 && isClient3 == 5 && isClient4 == 5) {
                System.out.println("Second client is win!!!");
                break;
            }
            else if (isClient1 == 5 && isClient2 == 5 && isClient4 == 5) {
                System.out.println("Third client is win!!!");
                break;
            }
            else if (isClient1 == 5 && isClient2 == 5 && isClient3 == 5) {
                System.out.println("Fourth client is win!!!");
                break;
            }
        }
    }
}