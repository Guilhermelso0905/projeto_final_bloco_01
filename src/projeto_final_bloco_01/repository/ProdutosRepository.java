package projeto_final_bloco_01.repository;

import projeto_final_bloco_01.model.Produtos;

public interface ProdutosRepository {
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(Produtos projeto_final_bloco_01);
	public void atualizar(Produtos projeto_final_bloco_01);
	public void deletar(int numero);

}
