package com.navent.java.service;

import com.navent.java.cache.BumexMemcached;
import com.navent.java.dao.PedidoDAO;
import com.navent.java.model.Pedido;

public class PedidoServiceImpl {
	
	private static BumexMemcached cache = BumexMemcached.getInstance();
	
	public synchronized Pedido createOrUpdate(Pedido pedido) {
		PedidoDAO.insertOrUpdate(pedido);
		cache.set(pedido.getIdPedido().toString(), pedido);
		return pedido;
	}
	
	public synchronized void delete(Pedido pedido) {
		PedidoDAO.delete(pedido);
		cache.delete(pedido.getIdPedido().toString());
	}
	
	public Pedido select(Integer idPedido) {
		Object pedido = cache.get(idPedido.toString());
		if (pedido != null && pedido instanceof Pedido) {
			return (Pedido) pedido;
		}
		return PedidoDAO.select(idPedido);
	}
}
