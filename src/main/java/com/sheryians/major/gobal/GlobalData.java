package com.sheryians.major.gobal;

import java.util.ArrayList;
import java.util.List;

import com.sheryians.major.model.Product;

public class GlobalData {

	public static List<Product> cart;
	static {
		cart=new ArrayList<Product>();
	}
}
