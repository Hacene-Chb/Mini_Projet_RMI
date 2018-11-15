package Exo2;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface InterPizza extends Remote {
 public Double Calculer_Prix(int qt, String choiradiob, String s) throws RemoteException;
}
