class Biscuit{
	
	String brand;
	int price;
	String expiryDate;
	double weight;
	String manufacturedBy;
	double quantity;
	int noOfPieces;
	
	Biscuit()
	{
		System.out.println("Inside no argument Constructor");
	}
	Biscuit(String brand)
	{
		System.out.println("Inside argument is Executed");
		this.brand=brand;
	}
	Biscuit(String brand,int price)
	{
		this(brand);
		//System.out.println("Inside argument is Executed");
		this.price=price;
	}
	Biscuit(String brand,int price,String expiryDate)
	{
		this(brand,price);
		//System.out.println("Inside argument is Executed");
		this.expiryDate=expiryDate;
	}
	Biscuit(String brand,int price,String expiryDate,double weight)
	{
		this(brand,price,expiryDate);
		//System.out.println("Inside argument is Executed");
		this.weight=weight;
	}
	Biscuit(String brand,int price,String expiryDate,double weight,String manufacturedBy)
	{
		this(brand,price,expiryDate,weight);
		//System.out.println("Inside argument is Executed");
		this.manufacturedBy=manufacturedBy;
	}
	Biscuit(String brand,int price,String expiryDate,double weight,String manufacturedBy,double quantity)
	{
		this(brand,price,expiryDate,weight,manufacturedBy);
		//System.out.println("Inside argument is Executed");
		this.quantity=quantity;
	}
	Biscuit(String brand,int price,String expiryDate,double weight,String manufacturedBy,double quantity,int noOfPieces)
	{
		this(brand,price,expiryDate,weight,manufacturedBy,quantity);
		//System.out.println("Inside argument is Executed");
		this.noOfPieces=noOfPieces;
	}
	
	public static void main(String[] lion)
	
	{
		Biscuit biscuit=new Biscuit();
		
		biscuit.brand="Parle G";
		biscuit.price=10;
		biscuit.expiryDate="Best before 2 months";
		biscuit.weight=40;
		biscuit.manufacturedBy="Parle";
		biscuit.quantity=30;
		biscuit.noOfPieces=24;
		
		System.out.println(biscuit.brand);
		System.out.println(biscuit.price);
		System.out.println(biscuit.expiryDate);
		System.out.println(biscuit.weight);
		System.out.println(biscuit.manufacturedBy);
		System.out.println(biscuit.quantity);
		System.out.println(biscuit.noOfPieces);
		
		Biscuit biscuit1=new Biscuit("Parle G");
		
		biscuit1.price=10;
		biscuit1.expiryDate="Best before 2 months";
		biscuit1.weight=40;
		biscuit1.manufacturedBy="Parle";
		biscuit1.quantity=30;
		biscuit1.noOfPieces=24;
		
		System.out.println(biscuit1.brand);
		System.out.println(biscuit1.price);
		System.out.println(biscuit1.expiryDate);
		System.out.println(biscuit1.weight);
		System.out.println(biscuit1.manufacturedBy);
		System.out.println(biscuit1.quantity);
		System.out.println(biscuit1.noOfPieces);
		
		Biscuit biscuit2=new Biscuit("Parle G",10);
		
		biscuit2.expiryDate="Best before 2 months";
		biscuit2.weight=40;
		biscuit2.manufacturedBy="Parle";
		biscuit2.quantity=30;
		biscuit2.noOfPieces=24;
		
		System.out.println(biscuit2.brand);
		System.out.println(biscuit2.price);
		System.out.println(biscuit2.expiryDate);
		System.out.println(biscuit2.weight);
		System.out.println(biscuit2.manufacturedBy);
		System.out.println(biscuit2.quantity);
		System.out.println(biscuit2.noOfPieces);
		
		Biscuit biscuit3=new Biscuit("Parle G",10,"Best before 2 months");
	
		biscuit3.weight=40;
		biscuit3.manufacturedBy="Parle";
		biscuit3.quantity=30;
		biscuit3.noOfPieces=24;
		
		System.out.println(biscuit3.brand);
		System.out.println(biscuit3.price);
		System.out.println(biscuit3.expiryDate);
		System.out.println(biscuit3.weight);
		System.out.println(biscuit3.manufacturedBy);
		System.out.println(biscuit3.quantity);
		System.out.println(biscuit3.noOfPieces);
		
		Biscuit biscuit4=new Biscuit("Parle G",10,"Best before 2 months",40);

		biscuit4.manufacturedBy="Parle";
		biscuit4.quantity=30;
		biscuit4.noOfPieces=24;
		
		System.out.println(biscuit4.brand);
		System.out.println(biscuit4.price);
		System.out.println(biscuit4.expiryDate);
		System.out.println(biscuit4.weight);
		System.out.println(biscuit4.manufacturedBy);
		System.out.println(biscuit4.quantity);
		System.out.println(biscuit4.noOfPieces);
		
		Biscuit biscuit5=new Biscuit("Parle G",10,"Best before 2 months",40,"Parle");

		biscuit5.quantity=30;
		biscuit5.noOfPieces=24;
		
		System.out.println(biscuit5.brand);
		System.out.println(biscuit5.price);
		System.out.println(biscuit5.expiryDate);
		System.out.println(biscuit5.weight);
		System.out.println(biscuit5.manufacturedBy);
		System.out.println(biscuit5.quantity);
		System.out.println(biscuit5.noOfPieces);
		
		Biscuit biscuit6=new Biscuit("Parle G",10,"Best before 2 months",40,"Parle",30);

		biscuit6.noOfPieces=24;
		
		System.out.println(biscuit6.brand);
		System.out.println(biscuit6.price);
		System.out.println(biscuit6.expiryDate);
		System.out.println(biscuit6.weight);
		System.out.println(biscuit6.manufacturedBy);
		System.out.println(biscuit6.quantity);
		System.out.println(biscuit6.noOfPieces);
		
		Biscuit biscuit7=new Biscuit("Parle G",10,"Best before 2 months",40,"Parle",30,24);
		
		System.out.println(biscuit7.brand);
		System.out.println(biscuit7.price);
		System.out.println(biscuit7.expiryDate);
		System.out.println(biscuit7.weight);
		System.out.println(biscuit7.manufacturedBy);
		System.out.println(biscuit7.quantity);
		System.out.println(biscuit7.noOfPieces);
	}
	
	
	
}



