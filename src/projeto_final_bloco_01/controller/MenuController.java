package projeto_final_bloco_01.controller;

import java.util.ArrayList;

import projeto_final_bloco_01.model.Produtos;
import projeto_final_bloco_01.repository.ProdutosRepository;

public class MenuController implements ProdutosRepository {

	private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
	int codigoproduto = 0;

	@Override
	public void procurarPorNumero(int codigoproduto) {
		var produto = buscarnaListaProdutos(codigoproduto);

		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO Produto número: " + codigoproduto + " não foi encontrado!");

	}

	@Override
	public void listarTodas() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	@Override
	public void cadastrar(Produtos projeto_final_bloco_01) {
		listaProdutos.add(projeto_final_bloco_01);
		System.out
				.println("\nO Produto número: " + projeto_final_bloco_01.getCodigoproduto() + " foi criado com sucesso!");

	}

	@Override
	public void atualizar(Produtos projeto_final_bloco_01) {
		var buscaProduto = buscarnaListaProdutos(projeto_final_bloco_01.getCodigoproduto());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), projeto_final_bloco_01);
			System.out.println(
					"\nO Produto numero: " + projeto_final_bloco_01.getCodigoproduto() + " foi atualizado com sucesso!");
		} else
			System.out
					.println("\nO Produto numero: " + projeto_final_bloco_01.getCodigoproduto() + " não foi encontrado!");

	}

	@Override
	public void deletar(int codigoproduto) {
		var produto = buscarnaListaProdutos(codigoproduto);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO Produto numero: " + codigoproduto + " foi deletado com sucesso!");
		} else
			System.out.println("\nO Produto numero: " + codigoproduto + " não foi encontrado!");

	}

	public Produtos buscarnaListaProdutos(int codigoproduto) {
		for (var produto : listaProdutos) {
			if (produto.getCodigoproduto() == codigoproduto) {
				return produto;
			}
		}

		return null;
	}

	public int gerarCodigoproduto() {

		return ++codigoproduto;

	}

}
