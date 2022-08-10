class Trainer{
	
	String name;
	long contactNo;
	double exp;
	Gender gender;
	int age;
	
	
	Trainer(String name,long contactNo,double exp)
	{
		this.name=name;
		this.contactNo=contactNo;
		this.exp=exp;
	}
	void setGender(Gender gender)
	{
		this.gender=gender;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.contactNo);
		System.out.println(this.exp);
		System.out.println(this.gender.values);
		System.out.println(this.age);
	}
	
}