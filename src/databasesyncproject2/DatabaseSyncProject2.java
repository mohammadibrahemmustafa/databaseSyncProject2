/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasesyncproject2;

import databaseConnector.SqlLocalConnection;
import synchronizer.Synchronizer;
import util.Config;

/**
 *
 * @author Bcc
 */

public class DatabaseSyncProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SqlLocalConnection local=new SqlLocalConnection();
        String tableName="names";
       /* local.doInsert(tableName, "ali");
        local.doInsert(tableName, "saeed");
        local.doInsert(tableName, "manar");
       */
        //local.getInsertedElementFromTable(tableName);
        /*local.doDelete(tableName, 5);
        local.doDelete(tableName, 25);
        local.doDelete(tableName, 15);
        */
        //local.doInsert(tableName, "DAS");
        //local.doDelete(tableName, 18);
        Synchronizer synchronizer=new Synchronizer();
        synchronizer.Sync(Config.DATABASE_NAME,Config.USER_NAME,Config.PASSWORD,local);
    }
    
}
