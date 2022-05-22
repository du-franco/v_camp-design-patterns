package outeletstore.valtech.director;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
	
	private static final OrderList orderList = new OrderList();
	
	private OrderList() {}
	
	//Criado um método getInstance que retornará um nova orderList;
	
	public static OrderList getInstance() {
		return orderList;
	}
	
	//Criado uma variável actual que recebe 1, será usada para trazer a informação do pedido atual, próximo, como também resetar 
	
	private int actual = 1;
	
	public List<Order> listOrder = new ArrayList<Order>();
	
	public Order getActual() {
		return listOrder.get(actual);
	}
	
	public boolean orderNext() {
		return listOrder.size() > actual;
	}
	
	public void reset() {
		actual = 0;
	}
	
	/**
	 * Foi criado um list Observer e um novo arrayList do Observer
	 * Através do método renderOrderList, cada alteraçao no processo o Observer ficará esperando,
	 * e quando essa alteração ocorrer irá subscrever e informar o que foi alterado.
	 * 
	 * */
	
	public List<Observer> subs = new ArrayList<Observer>();
	
	public void renderOrderList(int order) {
		for (Observer observer : subs ) {
			observer.observable(order);
		}
	}
	
	public void subs(Observer observer) {
		this.subs.add(observer);
	}

}
