package br.com.felipe.converter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.felipe.model.Produto;

@FacesConverter(forClass = Produto.class, value = "produtoConverter")
public class ProdutoConverter implements Converter {

	private List<Produto> produtos;

	public ProdutoConverter(List<Produto> lista) {
		this.setProdutos(lista);
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Produto retorno = null;
		for (Produto p : produtos) {
			if (p.getId().equals(Integer.parseInt(value))) {
				retorno = p;
			}
		}
		return retorno;

	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null) {
			return null;
		}
		Produto retorno = (Produto) value;
		return retorno.getId().toString();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
