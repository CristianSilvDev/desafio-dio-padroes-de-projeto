package one.digitalinnovation.gof.one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define o padrão <b> Strategy</b> no domínio de cliente. 
 * Com isso, se necessário, podemos ter multiplas implementaçõe sdessa mesma interface. 
 * 
 * @author crist
 * 
 */
public interface ClienteService {

	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar (Long id, Cliente cliente);
	
	void deletar(Long id);
	
}
