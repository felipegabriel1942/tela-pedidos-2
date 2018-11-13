package br.com.felipe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.TabChangeEvent;

import br.com.felipe.converter.ProdutoConverter;
import br.com.felipe.model.Cliente;
import br.com.felipe.model.Pedido;
import br.com.felipe.model.Produto;
import br.com.felipe.service.ApplicationService;

@ManagedBean(name = "telaBean")
@RequestScoped
public class TelaBean {

	ApplicationService ap = new ApplicationService();

	private List<Cliente> clientes = new ArrayList<>();

	private List<Pedido> pedidos = new ArrayList<>();

	private List<Pedido> listaPedidosCliente = new ArrayList<>();

	private List<Produto> produtos = new ArrayList<>();

	private List<List<Pedido>> matrizPedidos = new ArrayList<>();

	private Cliente clienteSelecionado = new Cliente();

	private String pedidoAtivo;

	private Produto produtoBuscado = new Produto();

	private ProdutoConverter produtoConverter;

	@PostConstruct
	public void init() {
		clientes.addAll(ap.popularClientes());
		pedidos.addAll(ap.popularPedidos(clientes));
		produtos.addAll(ap.popularProdutos());
		produtoConverter = new ProdutoConverter(produtos);

	}

	public void selecionarCliente(SelectEvent event) {
		setClienteSelecionado((Cliente) event.getObject());
		listaDePedidosDoClienteSelecionado();
	}

	public List<Pedido> listaDePedidosDoClienteSelecionado() {
		for (int i = 0; i < pedidos.size(); i++) {
			if (pedidos.get(i).getCliente().getId() == clienteSelecionado.getId()) {
				listaPedidosCliente.add(pedidos.get(i));
			}
		}
		return listaPedidosCliente;
	}

	public void popularMatrizDePedidos() {
		for (int i = 0; i < listaPedidosCliente.size(); i++) {
			List<Pedido> pedidos = new ArrayList<>();
			Pedido pedido = new Pedido();
			pedido.setProduto(null);
			pedidos.add(pedido);
			matrizPedidos.add(pedidos);

		}
	}

	public List<Produto> autoCompleteProduto(String query) {
		List<Produto> produtoFiltrados = new ArrayList<>();

		for (int i = 0; i < produtos.size(); i++) {
			Produto produto = produtos.get(i);

			if (produto.getNome().toLowerCase().contains(query)) {
				produtoFiltrados.add(produto);
			}

		}

		return produtoFiltrados;
	}

	public void pegarProduto(SelectEvent event) {
		System.out.println("Nome do produto: " + ((Produto) event.getObject()).getNome());
	}

	public void troca(TabChangeEvent event) {
		System.out.println("Mudou... ");
		FacesMessage msg = new FacesMessage("Tab Changed", "Active Tab: " + event.getTab().getTitle());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public ApplicationService getAp() {
		return ap;
	}

	public void setAp(ApplicationService ap) {
		this.ap = ap;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente getClienteSelecionado() {
		return clienteSelecionado;
	}

	public void setClienteSelecionado(Cliente clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public List<Pedido> getListaPedidosCliente() {
		return listaPedidosCliente;
	}

	public void setListaPedidosCliente(List<Pedido> listaPedidosCliente) {
		this.listaPedidosCliente = listaPedidosCliente;
	}

	public List<List<Pedido>> getMatrizPedidos() {
		return matrizPedidos;
	}

	public void setMatrizPedidos(List<List<Pedido>> matrizPedidos) {
		this.matrizPedidos = matrizPedidos;
	}

	public String getPedidoAtivo() {
		return pedidoAtivo;
	}

	public void setPedidoAtivo(String pedidoAtivo) {
		this.pedidoAtivo = pedidoAtivo;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Produto getProdutoBuscado() {
		return produtoBuscado;
	}

	public void setProdutoBuscado(Produto produtoBuscado) {
		this.produtoBuscado = produtoBuscado;
	}

	public ProdutoConverter getProdutoConverter() {
		return produtoConverter;
	}

	public void setProdutoConverter(ProdutoConverter produtoConverter) {
		this.produtoConverter = produtoConverter;
	}

}
