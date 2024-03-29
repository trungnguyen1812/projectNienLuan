/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

/**
 *
 * @author LENOVO
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {

    private final String serverName = "localhost";
    private final String dbName = "quanlynienluan";
    private final String portNumber = "1433";
    //  private final String instance=""; 
    private final String userID = "sa";
    private final String password = "sa";

    public Connection getConnection() throws Exception {
        //String url ="jdbc:sqlserver://"+serverName+":"+portNumber+"\\"+instance+";databaseName="+dbName;
        //if(instance == null || instance.trim().isEmpty())
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName + ";encrypt=true;trustServerCertificate=true";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }

}
