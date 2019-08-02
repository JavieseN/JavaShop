package com.es.eoi.managers;

import com.es.eoi.entities.Article;
import com.es.eoi.entities.Warehouse;
import com.es.eoi.interfaces.Manageable;

public class ArticleManager implements Manageable<Article>
{
	private Warehouse warehouse;	

	public ArticleManager(Warehouse warehouse) 
	{
		super();
		this.warehouse = warehouse;
	}

	@Override
	public void save(Article newArticle) 
	{
		for (int i = 0; i < warehouse.getArticles().length; i++) 
		{
			if(warehouse.getArticles()[i] == null)
			{
				warehouse.getArticles()[i] = newArticle;
				warehouse.getArticles()[i].setCode(i);
				break;
			}
		}
		/*for (Article article : warehouse.getArticles()) 
		{
			if (article.equals(null)) 
			{
				article = newArticle;
				break;
			}
		}*/
	}

	@Override
	public void delete(Article deleteArticle) 
	{

		for (Article article : warehouse.getArticles()) 
		{

			if (article.equals(deleteArticle)) 
			{
				article = null;
			}
		}
	}
	
	@Override
	public void update(Article article) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Article[] listAll() 
	{
		return warehouse.getArticles();
	}
}
