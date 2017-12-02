class Vehicle 
{ 
	public String type() 
	{ return "type"; 
	} 
}
		class FourWheeler extends Vehicle
		{
			public String type()
			{ 
				return "car";
			}
		}
		class TwoWheeler extends Vehicle 
		{
			public String type() 
			{ 
			return "motorbike"; 
			}
		} 
		class Sample5
		{
		public static void main(String[] args)
		{ 
		Vehicle vehicle = new FourWheeler();
		//TwoWheeler twoWheeler = (TwoWheeler)vehicle;
		TwoWheeler twoWheeler = new TwoWheeler();
		System.out.println(twoWheeler.type());
		}
		}


	