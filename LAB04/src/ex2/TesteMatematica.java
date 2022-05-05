package exercicio2;

public class TesteMatematica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matematica mat = new Matematica();
		
		System.out.println(mat.max3(5, 23, 7));
		System.out.println(mat.impar(false, true, true));
		
		System.out.println(mat.maioria(true,false, true));
	}

}
