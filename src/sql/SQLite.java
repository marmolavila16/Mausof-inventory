package src.sql;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLite {

    final static String ruta = "database" + File.separator;
    
    public SQLite(){
        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:" + ruta + "DataBase.db");){
            System.out.println("Se creo correctamente");
        }catch(SQLException e){
            System.out.println("Error. " + e.getMessage());
        }
    }
}
