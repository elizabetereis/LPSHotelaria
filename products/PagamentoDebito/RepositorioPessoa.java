
import java.util.ArrayList;
import java.util.List;



/**
 * TODO description
 */
public class RepositorioPessoa implements IPessoa{
	
	//List listaPessoas = new ArrayList();
	private Pessoa[] listaPessoas = new Pessoa[10];
	
	public boolean cadastrarPessoa(Pessoa pessoa){
		
		try{
			
			for(int i=0; i<=10; i++){
				
				listaPessoas[i] = pessoa;
				
			}
			
			
		} catch(Exception e){
			
			return false;
			
		}
		
		return true;
	}
	
	
	public boolean alterarPessoa(Pessoa pessoa){
		return false;
	}
	
	public boolean excluirPessoa(int id){
		
	//	for(Pessoa pessoa : listaPessoas) {
		//	if(pessoa.getIdentificacao() == id)
				//listaPessoas.remove(pessoa);
	//		  
	//	}
		
		return false;
	//}
	}
}