package br.com.felipe.model;

import java.io.Serializable;

public class Pedido implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Produto produto;	
	private Cliente cliente;
	
	public Pedido() {
		
	}
	
	public Pedido(Integer id, Cliente cliente) {
		this.id = id;
		this.cliente = cliente;
	}
	
	public Pedido(Integer id, Produto produto, Cliente cliente) {
		this.id = id;
		this.produto = produto;
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	

}
