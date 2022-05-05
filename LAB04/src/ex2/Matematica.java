package exercicio2;

/**
 * Classe Matematica referente ao exercicio 2
 *
 * @author Victor Martins Gnidarxic
 */


public class Matematica {
	
	
	static int max3(int a, int b, int c){
		
		if(a>b && a>c){
			return a;
		}
		else if(b>a && b>c){
			return b;
		}
		else if(c>a && c>b){
			return c;
		}
		return 0;
	}
	
	static boolean impar( boolean a, boolean b, boolean c){
		
		if(a==true && b== true && c==true){
			return true;
		}
		else if((a==true && b==false && c==false) || (b==true && a==false && c==false) || (c==true && b==false && a==false)  ){
			return true;
		}else
			return false;
	
	}
	
	static boolean maioria( boolean a, boolean b, boolean c){
		
		return ((a&&b) || (a&&b) || (a&&c));
	}
}
