package OpExercicios;

public class TestarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Cliente[] objetoCliente = new Cliente[3];
      objetoCliente[0] = new Cliente("Maria Brasil",1112343445, 957886552,"crédito", 100);
      objetoCliente[1] = new Cliente("Sonia Faria", 222745694, 945672454,"dinheiro",800);
      objetoCliente[2] = new Cliente("Jesus da Silva",388486508, 956651221, "débito",400);
      
      for(int x=0;x<=2;x++)
      {
    	System.out.println("\n**************************************\n");
    	  objetoCliente[x].printInfo();
      }
      System.out.println("\n**************************************\n");
      
      }
	}

