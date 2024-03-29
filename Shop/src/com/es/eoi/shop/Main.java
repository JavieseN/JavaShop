package com.es.eoi.shop;

import com.es.eoi.entities.Warehouse;
import com.es.eoi.managers.ArticleManager;
import com.es.eoi.shop.utils.ArticleFactory;
import com.es.eoi.views.Menu;

public class Main 
{
	public static final Warehouse warehouse = new Warehouse(100);
	
	public static ArticleManager articleManager = new ArticleManager(warehouse);
	
	public static void main(String[] args) 
	{
		initWarehouse();
		
		Menu.printMenu();

	}
	
	public static void initWarehouse() 
	{

		for (int i = 0; i < 5; i++) 
		{
			warehouse.getArticles()[i] = ArticleFactory.getArticle("textil");
		}
		for (int i = 5; i < 10; i++) 
		{
			warehouse.getArticles()[i] = ArticleFactory.getArticle("alimentacion");
		}

	}

}
