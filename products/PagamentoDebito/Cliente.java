

/**
 * TODO description
 */


public class Cliente extends Pessoa{
	
	

	
	public static void main(String[] args) {
		
		boolean resul;
		
		RepositorioPessoa rp = new RepositorioPessoa();
		Cliente cliente = new Cliente();
		
		cliente.setNome("Daiane");
		cliente.setIdentificacao("123");
		cliente.setEndereco("Cabula");
		cliente.setEmail("dai@gmail");
		
        resul = rp.cadastrarPessoa(cliente);
        
        
        if(resul){
        	System.out.println("Cliente "+cliente.getNome()+" cadastrada com sucesso!");
        }else{
        	System.out.println("N�o foi poss�vel cadastrar!");	
        }
		
	}
	

}