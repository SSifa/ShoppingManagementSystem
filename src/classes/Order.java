package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private String order;
	private List<Product> products = new ArrayList<Product>();
	
	void add(Product product)
	{
		products.add(product);
	}
	void SetOrder(String _order)
	{
		this.order = _order;
	}
	String GetOrder()
	{
		return order;
	}
	
	public List<Product> getProducts()
    {
    	return products;
    }
    
    public void setProducts(List<Product> _product)
    {
    	this.products = _product;
    }

    public boolean CheckProduct(String name)
     {
    	for(int i = 0; i < products.size(); i++)
		{
    		if(products.get(i).getName()==name&&products.get(i).getQuantity()>0)
    		{
    			return true;
    		}
		}
    	 return false;
    	
     }  
}
