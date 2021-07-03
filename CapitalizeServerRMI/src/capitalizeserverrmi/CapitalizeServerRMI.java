/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalizeserverrmi;

import capitalizeimpl.CapitalizeImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Amina
 */
public class CapitalizeServerRMI {


    public CapitalizeServerRMI() {
        Registry reg;
        try {
            reg = LocateRegistry.createRegistry(1099);
            CapitalizeImpl c = new CapitalizeImpl();
            reg.rebind("CapitalizeService", c);
            System.out.println("Server is running...");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.toString());
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        new CapitalizeServerRMI();
    }

}
