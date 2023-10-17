import java.util.Scanner;
public class proyectoF{
	public static void main(String[] args) {
		
		Scanner txt = new Scanner(System.in);

		int menu = 0;
		int op = 0;
		//almacenamiento
		int splmC = 50;
		int splmE = 75;
		int splmS = 33;
		int splmP = 47;
		int cua = 15;
		int cart = 22;
		int fras = 30;
		//Mantenimiento
		int mantC = 11;
		int mantE = 16;
		int mantS = 12;
		int mantP = 6;
		//Pedidos
		int pC = 0;
		int pE = 0;
		int pS = 0;
		int pP = 0;
		int pcua = 0;
		int pcart = 0;
		int pfras = 0;
		int pedido = 0;
		
		double cC = 0;
		double cE = 0;
		double cS = 0;
		double cP = 0;
		double ccua = 0;
		double ccart = 0;
		double cfras = 0;
		double cT;
		
		int id;//ID
		int idPc = 1;
		int idPe = 2;
		int idPs = 3;
		int idPp = 4;
		int idC = 5;
		int idCa = 6;
		int idFr = 7;
		

		System.out.println("-------------------------------------------------------");
		System.out.println("|                Papeleria Casa Xavir                 |");
		System.out.println("-------------------------------------------------------");
		System.out.println("| 1)Inventario | 2)Mantenimiento | 3)Pedido | 4)Salir |");
		System.out.println("-------------------------------------------------------");
		menu = txt.nextInt();
		while (menu !=1 && menu !=2 && menu !=3 && menu != 4) {
			menu =0;
		System.out.println("-------------------------------------------------------");
		System.out.println("|                Seleccione una opci\u00f3n v\u00e1lida         |");
		System.out.println("-------------------------------------------------------");
		System.out.println("| 1)Inventario | 2)Mantenimiento | 3)Pedido | 4)Salir |");
		System.out.println("-------------------------------------------------------");
			menu = txt.nextInt();
			}
				
		while (menu <=3) {
		if (menu == 1) { 	
			System.out.println("-------------------------------------------------------");
			System.out.println("| ID |          Art\u00edculo         |     N. Piezas      |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPc+" |  Pluma fuente de cartucho |       "+ splmC + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPe+" |  Pluma fuente de \u00e9mbolo   |       "+ splmE + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPs+" |  Pluma fuente de succi\u00f1n  |       "+ splmS + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPp+" |  Pluma fuente de piston   |       "+ splmP + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idC +" |         Cuaderno          |       "+ cua + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idCa+" |      Cartucho de tinta    |       "+ cart + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idFr+" |       Frasco de tinta     |       "+ fras + "           |");	
			System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n                |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|        1)A\u00f1adir          |         2)Salir          |");
			System.out.println("-------------------------------------------------------");
			op = txt.nextInt();
			while (op !=1 && op !=2) {
				op =0;
			System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n v\u00e1lida         |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|        1)A\u00f1adir          |         2)Salir          |");
			System.out.println("-------------------------------------------------------");
			op = txt.nextInt();
			}
			while (op == 1) {
				 	 
				System.out.println("-------------------------------------------------------");
				System.out.println("|Ingrese el ID del producto:                          |");
				System.out.println("-------------------------------------------------------");
				id = txt.nextInt();
				while (id <=0 || id>=8) {
					id=0;
				System.out.println("-------------------------------------------------------");
				System.out.println("|Ingrese un ID v\u00e1lido                                 |");
				System.out.println("-------------------------------------------------------");
				id = txt.nextInt();
				}
				System.out.println("-------------------------------------------------------");
				System.out.println("|Ingrese la cantidad:                                 |");
				System.out.println("-------------------------------------------------------");
				pedido = txt.nextInt();
				if (id == idFr) {
					fras= fras+ pedido;
				}
				if (id == idPc) {
					splmC= splmC+ pedido;
				}
				if (id == idPe) {
					splmE= splmE+ pedido;
				}
				if (id == idPs) {
					splmS= splmS+ pedido;
				}
				if (id == idPp) {
					splmP= splmP+ pedido;
				}
				if (id == idC) {
					cua= cua+ pedido;
				}
				if (id == idCa) {
					cart= cart+ pedido;
				}
				
			System.out.println("-------------------------------------------------------");
			System.out.println("| ID |          Art\u00edculo         |     N. Piezas      |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPc+" |  Pluma fuente de cartucho |       "+ splmC + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPe+" |  Pluma fuente de \u00e9mbolo   |       "+ splmE + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPs+" |  Pluma fuente de succi\u00f1n  |       "+ splmS + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPp+" |  Pluma fuente de piston   |       "+ splmP + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idC +" |         Cuaderno          |       "+ cua + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idCa+" |      Cartucho de tinta    |       "+ cart + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idFr+" |       Frasco de tinta     |       "+ fras + "           |");	
			System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n                |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|        1)A\u00f1adir          |         2)Salir          |");
				op=0;
				System.out.println("-------------------------------------------------------");
				op = txt.nextInt();
				while (op !=1 && op !=2) {
				op =0;
				System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n v\u00e1lida         |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|        1)A\u00f1adir          |         2)Salir          |");
			System.out.println("-------------------------------------------------------");
			op = txt.nextInt();
			}
				
				 }
		}else if ( menu == 2) {
			System.out.println("-------------------------------------------------------");
			System.out.println("| ID |          Art\u00edculo         |  En mantenimiento  |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPc+" |  Pluma fuente de cartucho |       "+ mantC + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPe+" |  Pluma fuente de \u00e9mbolo   |       "+ mantE + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPs+" |  Pluma fuente de succi\u00f1n  |       "+ mantS + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPp+" |  Pluma fuente de piston   |       "+ mantP + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n                |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|    1)A\u00f1adir    |    2)Limpieza    |     3)Salir     |");
			System.out.println("-------------------------------------------------------");
			op = txt.nextInt();
			while (op !=1 && op !=2 && op !=3) {
			System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n v\u00e1lida         |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|    1)A\u00f1adir    |    2)Limpieza    |     3)Salir     |");
			System.out.println("-------------------------------------------------------");
			op = txt.nextInt();
			}
			while (op ==1 || op ==2) {
				 	 
				System.out.println("-------------------------------------------------------");
				System.out.println("|Ingrese el ID del producto:                          |");
				System.out.println("-------------------------------------------------------");
				id = txt.nextInt();
				while (id <=0 || id>=5) {
					id=0;
				
				System.out.println("-------------------------------------------------------");
				System.out.println("|Ingrese un ID v\u00e1lido                                 |");
				System.out.println("-------------------------------------------------------");
				id = txt.nextInt();
				}
				System.out.println("-------------------------------------------------------");
				System.out.println("|Ingrese la cantidad:                                 |");
				System.out.println("-------------------------------------------------------");
				pedido = txt.nextInt();
				if (op ==1) {
						if (id == idPc) {
					splmC= splmC- pedido;
					mantC= mantC+pedido;
				}
				if (id == idPe) {
					splmE= splmE- pedido;
					mantE= mantE+pedido;
				}
				if (id == idPs) {
					splmS= splmS- pedido;
					mantS= mantS+pedido;
				}
				if (id == idPp) {
					splmP= splmP- pedido;
					mantP= mantP+pedido;
				}
				}
				if (op ==2) {
						if (id == idPc) {
					splmC= splmC+ pedido;
					mantC= mantC-pedido;
				}
				if (id == idPe) {
					splmE= splmE+ pedido;
					mantE= mantE-pedido;
				}
				if (id == idPs) {
					splmS= splmS+ pedido;
					mantS= mantS-pedido;
				}
				if (id == idPp) {
					splmP= splmP+ pedido;
					mantP= mantP-pedido;
				}
				}
				
			
				
			System.out.println("-------------------------------------------------------");
			System.out.println("| ID |          Art\u00edculo         |  En mantenimiento  |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPc+" |  Pluma fuente de cartucho |       "+ mantC + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPe+" |  Pluma fuente de \u00e9mbolo   |       "+ mantE + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPs+" |  Pluma fuente de succi\u00f1n  |       "+ mantS + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  "+idPp+" |  Pluma fuente de piston   |       "+ mantP + "           |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n                |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|    1)A\u00f1adir    |    2)Limpieza    |     3)Salir     |");
			System.out.println("-------------------------------------------------------");
			op = 0;
				op = txt.nextInt();
				while (op !=1 && op !=2 && op !=3) {
			System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n v\u00e1lida         |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|    1)A\u00f1adir    |    2)Limpieza    |     3)Salir     |");
			System.out.println("-------------------------------------------------------");
			op = txt.nextInt();
			}
				
		}
			
		}else if (menu == 3) {
				System.out.println("-------------------------------------------------------");
				System.out.println("|Ingrese el ID del producto:                          |");
				System.out.println("-------------------------------------------------------");
				id = txt.nextInt();
				while (id <=0 || id>=8) {
					id=0;
				
				System.out.println("-------------------------------------------------------");
				System.out.println("|Ingrese un ID v\u00e1lido                                 |");
				System.out.println("-------------------------------------------------------");
				id = txt.nextInt();
				}
				System.out.println("-------------------------------------------------------");
				System.out.println("|Ingrese la cantidad:                                 |");
				System.out.println("-------------------------------------------------------");
				pedido = txt.nextInt();
				
				if (id == idFr && pedido >= (fras+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				
				}else if(id == idFr && pedido <= fras) {
					pfras= pfras+ pedido;
					fras = fras-pedido;
				}
				if (id == idPc && pedido >= (splmC+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				}else if(id == idPc && pedido <= splmC){
					pC= pC+ pedido;
					splmC = splmC - pedido;
				}
				if (id == idPe && pedido >= (splmE+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				}else if(id == idPe && pedido <= splmE){
					pE = pE+ pedido;
					splmE = splmE - pedido;
				}
				if (id == idPs && pedido >= (splmS+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				}else if(id == idPs && pedido <= splmS){
					pS = pS+ pedido;
					splmS = splmS - pedido;
				}
				if (id == idPp && pedido >= (splmP+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				}else if(id == idPp && pedido <=splmP){
					pP = pP+ pedido;
					splmP = splmP - pedido;
				}
				if (id == idC && pedido >= (cua+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				}else if(id == idC && pedido <= cua){
					pcua = pcua + pedido;
					cua = cua - pedido;
				}
				if (id == idCa && pedido >= (cart+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				}else if(id == idCa && pedido <= cart) {
					pcart = pcart + pedido;
					cart = cart - pedido;
				}
			

			System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n                |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  1)A\u00f1adir producto   |    2)Cuenta   |  3)Cancelar  |");
			System.out.println("-------------------------------------------------------");
			op = txt.nextInt();
			while (op !=1 && op !=2 && op != 3) {
				op =0;
			System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n v\u00e1lida         |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  1)A\u00f1adir producto   |    2)Cuenta   |  3)Cancelar  |");
			System.out.println("-------------------------------------------------------");
			op = txt.nextInt();
			}
			while (op <= 2) {
				if (op == 1) {
					pedido =0;
					System.out.println("-------------------------------------------------------");
				System.out.println("|Ingrese el ID del producto:                          |");
				System.out.println("-------------------------------------------------------");
				id = txt.nextInt();
				while (id <=0 || id>=8) {
					id=0;
				
				System.out.println("-------------------------------------------------------");
				System.out.println("|Ingrese un ID v\u00e1lido                                 |");
				System.out.println("-------------------------------------------------------");
				id = txt.nextInt();
				}
				System.out.println("-------------------------------------------------------");
				System.out.println("|Ingrese la cantidad:                                 |");
				System.out.println("-------------------------------------------------------");
				pedido = txt.nextInt();
				if (id == idFr && pedido >= (fras+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				
				}else if(id == idFr && pedido <= fras) {
					pfras= pfras+ pedido;
					fras = fras-pedido;
				}
				if (id == idPc && pedido >= (splmC+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				}else if(id == idPc && pedido <= splmC){
					pC= pC+ pedido;
					splmC = splmC - pedido;
				}
				if (id == idPe && pedido >= (splmE+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				}else if(id == idPe && pedido <= splmE){
					pE = pE+ pedido;
					splmE = splmE - pedido;
				}
				if (id == idPs && pedido >= (splmS+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				}else if(id == idPs && pedido <= splmS){
					pS = pS+ pedido;
					splmS = splmS - pedido;
				}
				if (id == idPp && pedido >= (splmP+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				}else if(id == idPp && pedido <=splmP){
					pP = pP+ pedido;
					splmP = splmP - pedido;
				}
				if (id == idC && pedido >= (cua+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				}else if(id == idC && pedido <= cua){
					pcua = pcua + pedido;
					cua = cua - pedido;
				}
				if (id == idCa && pedido >= (cart+1)){
					System.out.println("-------------------------------------------------------");
					System.out.println("|No hay productos suficientes                          |");
					System.out.println("-------------------------------------------------------");
				}else if(id == idCa && pedido <= cart) {
					pcart = pcart + pedido;
					cart = cart - pedido;
				}


			System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n                |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  1)A\u00f1adir producto   |    2)Cuenta   |  3)Cancelar  |");
			System.out.println("-------------------------------------------------------");
			op = txt.nextInt();
			while (op !=1 && op !=2 && op != 3) {
				op =0;
			System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n v\u00e1lida         |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  1)A\u00f1adir producto   |    2)Cuenta   |  3)Cancelar  |");
			System.out.println("-------------------------------------------------------");
			op = txt.nextInt();
			}
				}else {
			System.out.println("-------------------------------------------------------");
			System.out.println("|Cant.|   Art\u00edculo         |   Precio U.   | Precio   |");
			System.out.println("-------------------------------------------------------");
					if (pC != 0) {
						cC=pC*400;
			System.out.println("|  "+pC+" |  Pluma de cartucho |      $400     |  "+ cC + "  |");
			System.out.println("-------------------------------------------------------");
					}
					if (pE != 0) {
						cE=pE*350;
			System.out.println("|  "+pE+" |  Pluma de \u00e9mbolo   |      $350     |  "+ cE + "  |");
			System.out.println("-------------------------------------------------------");
					}
					if (pS != 0) {
						cS=pS*200;
			System.out.println("|  "+pS+" |  Pluma de succi\u00f1n  |      $200     |  "+ cS + "  |");
			System.out.println("-------------------------------------------------------");
					}
					if (pP != 0) {
						cP=pP*250;
			System.out.println("|  "+pP+" |  Pluma de piston   |      $250     |  "+ cP + "  |");
			System.out.println("-------------------------------------------------------");
					}
					if (pcua != 0) {
						ccua=pcua*50;
			System.out.println("|  "+pcua+" |  Cuaderno        |      $50     |  "+ ccua + "  |");
			System.out.println("-------------------------------------------------------");
					}
					if (pcart != 0) {
						ccart=pcart*12;
			System.out.println("|  "+pC+" |  Cartucho de tinta |      $12     |  "+ ccart + "  |");
			System.out.println("-------------------------------------------------------");
					}
					if (pfras != 0) {
						cfras=pfras*40;
			System.out.println("|  "+pfras+" |  Frasco de tinta   |      $40     |  "+ cfras + "  |");
			System.out.println("-------------------------------------------------------");
					}
					cT=cC+cP+cE+cS+ccua+ccart+cfras;
			System.out.println("|          TOTAL            |         "+cT+"          |");
			System.out.println("-------------------------------------------------------");
			System.out.println("-------------------------------------------------------");
			System.out.println("|Favor de realizar la factura correspondiente         |");
			System.out.println("-------------------------------------------------------");
		pC = 0;
		 pE = 0;
		 pS = 0;
		 pP = 0;
		 pcua = 0;
		 pcart = 0;
		 pfras = 0;
		 pedido = 0;
			op =0;
			System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n                |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  1)A\u00f1adir producto   |    2)Cuenta   |  3)Cancelar  |");
			System.out.println("-------------------------------------------------------");
			op = txt.nextInt();
			while (op !=1 && op !=2 && op != 3) {
				op =0;
			System.out.println("-------------------------------------------------------");
			System.out.println("|                Seleccione una opci\u00f3n v\u00e1lida         |");
			System.out.println("-------------------------------------------------------");
			System.out.println("|  1)A\u00f1adir producto   |    2)Cuenta   |  3)Cancelar  |");
			System.out.println("-------------------------------------------------------");
			op = txt.nextInt();
			}
				}
			}
			
		}
menu = 0;	
		System.out.println("-------------------------------------------------------");
		System.out.println("|                Papeleria Casa Xavir                 |");
		System.out.println("-------------------------------------------------------");
		System.out.println("| 1)Inventario | 2)Mantenimiento | 3)Pedido | 4)Salir |");
		System.out.println("-------------------------------------------------------");
		menu = txt.nextInt();	
		while (menu !=1 && menu !=2 && menu !=3 && menu != 4) {
			menu =0;
		System.out.println("-------------------------------------------------------");
		System.out.println("|                Seleccione una opci\u00f3n v\u00e1lida         |");
		System.out.println("-------------------------------------------------------");
		System.out.println("| 1)Inventario | 2)Mantenimiento | 3)Pedido | 4)Salir |");
		System.out.println("-------------------------------------------------------");
			menu = txt.nextInt();
			}	
	}
}
}