package outeletstore.valtech.director;

import java.util.ArrayList;
import java.util.List;

import outeletstore.valtech.model.Product;

public class ProductInventory {

	/**
	 * Created the inventory product class as a singleton to instantiate the get,
	 * add and remove methods
	 */

	public static ProductInventory productInventory;

	public List<Product> stock = new ArrayList<Product>();

	public static ProductInventory getInstance() {
		if (productInventory == null) {
			productInventory = new ProductInventory();
		}
		return productInventory;
	}

	private ProductInventory() {
	}

	/**
	 * Usando o stream para processar dados de forma declarativa. Avalia esse
	 * predicado no argumento fornecido. Parâmetros:t o argumento de
	 * entradaReturns:true se o argumento de entrada corresponder ao predicado, caso
	 * contrário, falso
	 * 
	 * @param sku
	 * @return
	 * 
	 *         toList - Retorna: uma lista contendo os elementos do stream get -
	 *         retornará o elemento especificado na lista
	 */

	public Product getFilterProduct(int sku) {
		return stock.stream().filter(product -> product.sku == sku).toList().get(0);
	}

	public int getProductQuantitySku(int sku) {
		return getFilterProduct(sku).stockQuantity;
	}

	public int getReservedQuantitySku(int sku) {
		return getFilterProduct(sku).stockReserved;
	}

	public void addProductStock(int sku, int quantity) {
		getFilterProduct(sku).stockQuantity += quantity;
	}

	/**
	 * O método removeProductStock através da lógica verifica se a quantidade em
	 * estoque é maior do que a solicitada, caso sim ele retira do estoque, senão,
	 * aparece uma mensagem dizendo que a quantidade solicitada não é suficiente.
	 */

	public boolean removeProductStock(int sku, int quantity) {
		if (getFilterProduct(sku).stockQuantity >= quantity) {
			getFilterProduct(sku).stockQuantity -= quantity;
			return true;
		} else {
			System.out.println("The product in stock is not enough to meet the requested quantity at this time.");
			return false;
		}
	}

	public void addProductReserve(int sku, int quantity) {
		getFilterProduct(sku).stockReserved += quantity;
	}

	/**
	 * O método removeProductReserve através da lógica verifica se a quantidade
	 * reservada é maior do que a solicitada, caso sim ele retira da reserva, senão,
	 * aparece uma mensagem dizendo que a quantidade solicitada não é suficiente.
	 * 
	 */

	public void removeProductReserve(int sku, double quantity) {
		if (getFilterProduct(sku).stockReserved >= quantity) {
			getFilterProduct(sku).stockReserved -= quantity;
		} else {
			System.out.println("The reserved product is not enough to meet the requested quantity at this time.");
		}
	}

}
