/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientapplication;

import java.util.AbstractList;
import java.util.ArrayList;
import serversidepackage.*;

/**
 *
 * @author iDormenco
 */
public class ClientApplication {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        serversidepackage.Point a=new Point();
        a.name=new ArrayList<>();
        a.name.add(new Double(1));
        a.name.add(new Double(2));
        a.name.add(new Double(3));
        
        a.type=new ArrayList<>();
        a.type.add(new Double(1));
        a.type.add(new Double(2));
        a.type.add(new Double(3));
        
        a.value=new ArrayList<>();
        a.value.add(new Double(1));
        a.value.add(new Double(2));
        a.value.add(new Double(3));
        serversidepackage.Row row = new Row();
        row.rowPoints=new ArrayList<>();
        row.rowPoints.add(a);
        System.out.println(storeUserRow(row));
        
    }

    private static String storeUserRow(serversidepackage.Row userRow) {
        serversidepackage.BrokerWebService_Service service = new serversidepackage.BrokerWebService_Service();
        serversidepackage.BrokerWebService port = service.getBrokerWebServicePort();
        return port.storeUserRow(userRow);
    }
    
}
