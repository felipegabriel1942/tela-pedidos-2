package br.com.felipe.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.felipe.model.Cliente;
import br.com.felipe.model.Pedido;
import br.com.felipe.model.Produto;

public class ApplicationService implements Serializable {

	private static final long serialVersionUID = 1L;

	List<Cliente> listaClientes = new ArrayList<>();

	public List<Cliente> popularClientes() {
		List<Cliente> listaClientes = new ArrayList<>();

		Cliente cli1 = new Cliente(1, "João das neves");
		Cliente cli2 = new Cliente(2, "Maria Joaquina");
		Cliente cli3 = new Cliente(3, "Zacarias Tadeu");
		Cliente cli4 = new Cliente(4, "Abreu Zafeu");
		Cliente cli5 = new Cliente(5, "Lula ta preso");

		listaClientes.addAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5));

		return listaClientes;

	}

	public List<Pedido> popularPedidos(List<Cliente> listaClientes) {
		List<Pedido> listaPedidos = new ArrayList<>();

		Pedido ped1 = new Pedido(1, listaClientes.get(0));
		Pedido ped2 = new Pedido(2, listaClientes.get(1));
		Pedido ped3 = new Pedido(3, listaClientes.get(2));
		Pedido ped4 = new Pedido(4, listaClientes.get(3));
		Pedido ped5 = new Pedido(5, listaClientes.get(1));
		Pedido ped6 = new Pedido(6, listaClientes.get(2));
		Pedido ped7 = new Pedido(7, listaClientes.get(3));
		Pedido ped8 = new Pedido(8, listaClientes.get(4));
		Pedido ped9 = new Pedido(9, listaClientes.get(2));
		Pedido ped10 = new Pedido(10, listaClientes.get(2));
		Pedido ped11 = new Pedido(11, listaClientes.get(1));
		Pedido ped12 = new Pedido(12, listaClientes.get(3));
		Pedido ped13 = new Pedido(13, listaClientes.get(4));
		Pedido ped14 = new Pedido(14, listaClientes.get(2));
		Pedido ped15 = new Pedido(15, listaClientes.get(3));
		Pedido ped16 = new Pedido(16, listaClientes.get(4));
		Pedido ped17 = new Pedido(17, listaClientes.get(3));
		Pedido ped18 = new Pedido(18, listaClientes.get(0));
		Pedido ped19 = new Pedido(19, listaClientes.get(1));
		Pedido ped20 = new Pedido(20, listaClientes.get(0));

		listaPedidos.addAll(Arrays.asList(ped1, ped2, ped3, ped4, ped5, ped6, ped7, ped8, ped9, ped10, ped11, ped12,
				ped13, ped14, ped15, ped16, ped17, ped18, ped19, ped20));

		return listaPedidos;
	}

	public List<Produto> popularProdutos() {

		List<Produto> listaProduto = new ArrayList<>();

		Produto prod1 = new Produto(1, "Mouse", 10.00);
		Produto prod2 = new Produto(2, "Teclado", 15.50);
		Produto prod3 = new Produto(3, "Monitor", 350.00);
		Produto prod4 = new Produto(4, "Mousepad", 5.00);
		Produto prod5 = new Produto(5, "PC", 1200.00);
		Produto prod6 = new Produto(6, "Notebook", 2000.00);
		Produto prod7 = new Produto(7, "Fonte", 180.00);
		Produto prod8 = new Produto(8, "Placa de Video", 1200.00);
		Produto prod9 = new Produto(9, "Memoria RAM", 250.00);
		Produto prod10 = new Produto(10, "HD", 200.00);
		Produto prod11 = new Produto(11, "HDSSD", 250.00);
		Produto prod12 = new Produto(12, "Placa mãe", 300.00);
		Produto prod13 = new Produto(13, "Gabinete", 190.00);
		Produto prod14 = new Produto(14, "Leitor de CD", 100.00);
		Produto prod15 = new Produto(15, "Monitor 29 Polegadas Ultrawide", 1050.00);
		Produto prod16 = new Produto(16, "Cadeira Gamer", 950.00);
		Produto prod17 = new Produto(17, "Fone de Ouvido Gamer", 150.00);
		Produto prod18 = new Produto(18, "Mouse Gamer", 125.00);

		listaProduto.addAll(Arrays.asList(prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9, prod10, prod11,
				prod12, prod13, prod14, prod15, prod16, prod17, prod18));
		
		return listaProduto;
	}

}
