/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalizermi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Amina
 */
public interface Capitalize extends Remote {

    public String dsp(Object str) throws RemoteException;

}
   
