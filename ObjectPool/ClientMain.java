import java.sql.*;
import java.util.concurrent.TimeUnit;

public class ClientMain {

    public static void main(String[] args) throws InterruptedException {

        // DBObjectPool db2 = DBObjectPool.getPoolInstance();

        DBObjectPool db = new DBObjectPool("com.mysql.cj.jdbc.Driver",
                "jdbc:mysql://localhost:3306/" + DBObjectPool.dbname,
                "utm", "fcim", 32000L);


        //System.out.println(db.getExpired());

        final String query = "SELECT * FROM students";
        Connection conn = db.acquireReusable();

        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {

                System.out.println("============================================");

                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Address: " + rs.getString("address"));
                System.out.println("Country: " + rs.getString("country"));
                System.out.println("Phonne: " + rs.getString("phonee"));

                System.out.println("============================================");

            }

        } catch (SQLException e) {
            e.printStackTrace();
            // System.out.println("Not workingg!!");
        }


        db.releaseReusable(conn);


/*        Connection conn = db.acquireReusable();
        System.out.println("=========================");
        System.out.println(conn);
        System.out.println(db.getZanyato());
        System.out.println(db.getSvobodno());
        System.out.println("=========================");
        Connection conn2 = db.acquireReusable();
        System.out.println(conn2);
        System.out.println(db.getZanyato());
        System.out.println(db.getSvobodno());
        System.out.println("=========================");
        db.releaseReusable(conn); // освобождаем
        db.releaseReusable(conn2); // освобождаем

        TimeUnit.MILLISECONDS.sleep(3000);

        Connection conn3 = db.acquireReusable();
        System.out.println(conn3);
        System.out.println(db.getZanyato());
        System.out.println(db.getSvobodno());
        System.out.println("=========================");*/



/*        System.out.println(db.getExpired());
        System.out.println();

        for(int i = 0; i < 5; i++) {
            System.out.println(System.currentTimeMillis());
            TimeUnit.SECONDS.sleep(1);
        }*/
    }

}
