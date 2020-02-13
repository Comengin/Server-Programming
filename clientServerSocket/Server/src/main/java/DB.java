import java.sql.*;
import java.util.Random;

public class DB {
    private static final String URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "admin";
    private int id;
    private String answer;
    private String question;
    private Random rand = new Random();
    private static int num;
    private static int array[][]={{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
    public DB(int count) {
        try {
            if (count==0){
                this.num = rand.nextInt(20) + 1;
                while(true) {
                    if (array[1][num - 1] == 0) {
                        array[1][num-1]=1;
                        break;
                    }
                    else {
                        this.num = rand.nextInt(20) + 1;
                    }
                }
            }
            Connection connection = DriverManager.getConnection(URL, user, password);
            Statement statement = connection.createStatement();
            String query = "select * from usersquest where id="+num;
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                this.id = resultSet.getInt(1);
                this.question = resultSet.getString(2);
                this.answer = resultSet.getString(3);
            }
        } catch (SQLException e) {
            System.out.println("Failed to load driver class");
        }
    }
    public int getId(){
        return id;
    }
    public String getQuestion(){
        return  question;
    }
    public String getAnswer(){
        return answer;
    }
}