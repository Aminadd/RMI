/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalizeimpl;

import capitalizermi.Capitalize;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JLabel;

/**
 *
 * @author Amina
 */
public class CapitalizeImpl extends UnicastRemoteObject implements Capitalize {

    /**
     * @param args the command line arguments
     */
    public CapitalizeImpl() throws RemoteException {
        super();
    }

    public String dsp(Object str) throws RemoteException {
        String s = (String) str;
        return s.toUpperCase();
    }
}
