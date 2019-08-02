package com.es.eoi.shop.utils;

import com.es.eoi.entities.Article;
import com.es.eoi.entities.Electronics;
import com.es.eoi.entities.Food;
import com.es.eoi.entities.Textile;

public class ArticleFactory 
{

	public static Article getArticle(String category) {

		Article article = null;

		switch (category) 
		{
			case "textil":
				article = new Textile();
				break;
			case "electronica":
				article = new Electronics();
				break;
			case "alimentacion":
				article = new Food();
				break;
			default:
				break;
			}
		return article;

	}
}
