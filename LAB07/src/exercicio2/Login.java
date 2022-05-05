
package exercicio2;

public class Login {
	private String user;
	private int password;
	
	
	
	public Login( String user, int password){
		this.user = user;
		this.password = password;
	}



	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}



	public int getPassword() {
		return password;
	}



	public void setPassword(int password) {
		this.password = password;
	}
	
	
	public void logar(String user, int password){
		if(user.equals(this.getUser()) && password == (this.getPassword())){
			System.out.println("Login realizado com sucesso!!");
		}else{
			throw new FalhaLogin("Erro ao logar, verifique seu usu�rio e senha");
		}
	}
}
