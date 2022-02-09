import java.sql.*;

public class Answer1 {
    private static final String USER_NAME = "4XmSEZq374";
    private static final String DATABASE_NAME = "4XmSEZq374";
    private static final String PASSWORD = "CF7L8vpk5b";
    private static final String PORT = "3306";
    private static final String SERVER = "remoteMysql.com";
    private static String statementToExecute;

    public static void main(String[] args)  throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql:// + remoteMysql.com + 4XmSEZq374 + 3306, 4XmSEZq374 , CF7L8vpk5b");

//        createTable(con);
//          insertDog(con, "Mooki", 7, "pitbull");
//        insertDog(con, "Lassi", 3, "Wolf");
//        insertDog(con, "Ringo", 1, "poodel");
//        updateDogAge(con, 4, "Lassi", statementToExecute);
//        deleteDogFromTable(con, "Ringo");
        getTableContent(con);
        con.close();
    }

    private static void deleteDogFromTable(Connection con, String ringo) {
    }

    private static void createTable(Connection con) throws SQLException {
        String statementToExecute = "CREATE TABLE" + DATABASE_NAME + ".'Dogs'('name VARCHAR(40),'age' INT NOT NULL,'breed'VARCHAR(30) NOT NULL);";
        con.createStatement().execute(statementToExecute);
    }

    private static void insertDog(Connection con, String name, int age, String breed) throws SQLException {
        String statementToExecute = "INSERT INTO" + DATABASE_NAME + ".'Dogs'('name', 'breed') VALUES ('" + name + "','" + breed + "');";
        con.createStatement().execute(statementToExecute);
    }

    private static void updateDogAge(Connection con, int age, String name, String statementToExecute) throws SQLException {
        statementToExecute = "UPDATE `" + DATABASE_NAME + "`.`Dogs` SET `age`='" + age + "' WHERE `name`='" + name + "';";
        con.createStatement().executeUpdate(statementToExecute);
    }

    private static void DeleteDogFromTable(Connection con, String name) throws SQLException {
        String statementToExecute = "DELETE FROM '" + DATABASE_NAME + "'.'Dogs' WHERE 'name'='" + name + "';";
        con.createStatement().execute(statementToExecute);
    }

    private static void getTableContent(Connection con) throws SQLException {
        String statementToExecute = "SELECT * FROM" + DATABASE_NAME + ".Dogs;";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(statementToExecute);
        while (rs.next()) {
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String breed = rs.getString("breed");

            System.out.println("Name: " + name);
            System.out.println(",Age: " + age);
            System.out.println(",Breed: " + breed);
        }

        rs.close();
    }

























    }






