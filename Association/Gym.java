class Gym{
	
	String name;
	int fees;
	String [] equipments;
	Trainer trainer;
	
	Gym(String name,int fees,String[] equipments,Trainer trainer)
	{
		this.name=name;
		this.fees=fees;
		this.equipments=equipments;
		this.trainer=trainer;
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.fees);
		
		for(int b=0;b<this.equipments.length;b++)
		{
			System.out.println(this.equipments[b]);
		}
		this.trainer.printData();
	}
	
	public static void main(String[] lion)
	
	{
		String[] c = {"DUMBLES","THREAD MILL","CHEST","PUSH UPS"};
		Trainer trainer=new Trainer("RAVI",636040645L,3.5);
		
		trainer.setGender(Gender.MALE);
		
		trainer.setAge(33);
		
		Gym gym=new Gym("A1 Fitness",6000,c,trainer);
		gym.printData();
	}
}