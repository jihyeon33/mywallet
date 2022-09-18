package org.example.mywallet;

//import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleConnectionTest {
    private static final Logger logger = LoggerFactory.getLogger(OracleConnectionTest.class);
    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String USER= "system";
    private static final String PW = "1234";

    /*@Test*/
    public void testConnection() throws Exception{
        Class.forName(DRIVER);
        try(Connection con = DriverManager.getConnection(URL,USER,PW)){
            System.out.println(con);
            System.out.println("연결되었습니다.");
            logger.info("연결되었습니다.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
