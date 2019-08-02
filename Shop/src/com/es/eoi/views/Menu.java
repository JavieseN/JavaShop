package com.es.eoi.views;

import java.util.Scanner;

import com.es.eoi.entities.Article;
import com.es.eoi.shop.Main;
import com.es.eoi.shop.utils.ArticleFactory;

public class Menu 
{

	public static void printMenu()
	{
		boolean salir = false;
		Scanner scan;
		int option;
		System.out.println("BIENVENIDO A MI TIENDA, INTRODUZCA UNA OPCION");
		while(salir == false)
		{
			
			System.out.println("1-COMPRAR ARTICULOS");
			System.out.println("2-LISTAR ARTICULOS");
			System.out.println("3-GESTIONAR ARTICULOS");
			System.out.println("0-SALIR");
			
			scan = new Scanner(System.in);
			
			option= scan.nextInt();
			
			System.out.println("Has elegido la opcion: " + option);
			
			switch (option) 
			{
				/*case 1:
					
					break;*/
				case 2:
					listArticles();
					break;
				case 3:
					printMenuGestion();
					break;
				case 0:
					salir = true;
					break;
				default:
					break;
			}
		}
	}
	
	public static void listArticles()
	{
		for (int i = 0; i < Main.articleManager.listAll().length; i++) 
		{
			if(!(Main.articleManager.listAll()[i] == null))
			{
				System.out.println(Main.articleManager.listAll()[i].toString());
			}
		}
		
	}
	
	public static void printMenuGestion()
	{
		System.out.println("1-AÑADIR ARTICULO");
		System.out.println("2-BORRAR ARTICULO");
		System.out.println("3-MODIFICAR ARTICULO");
		System.out.println("0-SALIR");
		Scanner sca = new Scanner(System.in);
		int opcion = sca.nextInt();
		switch (opcion) 
		{
			case 1:
				System.out.println("DE QUE CATEGORÍA VA A SER EL PRODECTO");
				System.out.println("1. Textil");
				System.out.println("2. Comida");
				System.out.println("3. Electrónica");
				int category = sca.nextInt();
				String categoria = "";
				switch (category) 
				{
					case 1:
						categoria = "textil";
						break;
					case 2:
						categoria = "alimentacion";
						break;
					case 3:
						categoria = "electronica";
						break;
					default:
						break;
				}
				Article articulo = ArticleFactory.getArticle(categoria);
				
				Main.articleManager.save(articulo);
				break;
			case 2:
				
				break;
			case 3:
	
				break;
			default:
				break;
		}
	}
}
