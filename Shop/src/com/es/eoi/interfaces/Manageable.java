package com.es.eoi.interfaces;


public interface Manageable<A>
{
	public void save(A article);
	public void delete(A article);
	public void update(A article);
	public A[] listAll();
}
