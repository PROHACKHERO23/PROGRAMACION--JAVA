package mayormenor;

public class Triangulo {

	public static void main(String[] args) {
		 
		//declaracion de variables
		int lado1;
		int lado2;
		int lado3;
		
		//asignacion de variables
		lado1 = 8;
		lado2 = 8;
		lado3 = 8;
				
		if(lado1 == lado2) {
			if(lado1 == lado3) {
				
				System.out.println("El triangulo es equilatero");
			}else{
				
				System.out.println("El triangulo no es equilatero");
				
			}
			
		}else{
			
			System.out.println("El triangulo no es equilatero");
		}

	}

}
