package Exo2;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class server {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			imp_IPezza od= new imp_IPezza();
			Naming.rebind("rmi://localhost:1099/PZ", od);
			System.out.println("Le Serveur est Pr�t:");
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
