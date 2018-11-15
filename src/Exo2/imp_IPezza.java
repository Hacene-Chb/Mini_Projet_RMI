package Exo2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JOptionPane;
public class imp_IPezza extends UnicastRemoteObject implements InterPizza {
	private static final long serialVersionUID = 1L;
	Double prix = 0.00;
	protected imp_IPezza() throws RemoteException {		
	}  
	@Override
	public Double Calculer_Prix(int qte,String c1,String l) throws RemoteException {
		
                if(qte==0)
                   JOptionPane.showMessageDialog(null,"Faut commander au moin une pizza");

                if (c1.equals("Petite")){
			prix = 100.00;
		}else if(c1.equals("Moyenne")){
			prix = 150.00;
		}else if(c1.equals("Large")){
			prix = 200.00;
		}		
		if (l.equals("t")) prix=prix+150;
		System.out.println("le prix ...123 :"+prix);
		if (l.equals("sans poulet")) prix = prix + 100;
		if (l.equals("sans poivron")) prix = prix + 90;
		if (l.equals("sans oignant")) prix = prix + 75;
		if (l.equals("sans champignon")) prix = prix + 55;
		if (l.equals("Fromage Extra")) prix = prix +30;		
		if (l.equals("Olives Vertes")) prix = prix +25;
		if (l.equals("Champignon")) prix = prix +20;
		if (l.equals("Oignons")) prix = prix +15;
		if (l.equals("Poivrons Verts")) prix = prix +10;
		if (l.equals("Pepites de Poulet")) prix = prix +50;
		if (l.equals("")) prix = prix+0; 		
		Double Total = prix*qte;
		return Total;		
	}
}
