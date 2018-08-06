package com.navent.java.cache;

public class BumexMemcached {
	
	private static BumexMemcached INSTANCE;

	private BumexMemcached() { }
	
	public static synchronized BumexMemcached getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new BumexMemcached();
		}
		return INSTANCE;
	}
	
	public void set(String key, Object value) {
		//Implementacion
	}
	
	public Object get(String key) {
		return null;
	}
	
	public void delete(String key) {
		//Implementacion
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Ya existe una instancia");
	}
	
	
}
