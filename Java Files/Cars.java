public class Cars{
	private String carName;
	private int  fuelCapacity;

	public Cars(int fuelCapacity,String carName){
		this.carName=carName;
		this.fuelCapacity=fuelCapacity;
	}

	public void drive(int distance) throws CarOutOfFuelException{
		if(fuelCapacity>0&&fuelCapacity>distance){
			System.out.println("Yes");}
			else
		{throw new CarOutOfFuelException("Not enough fuel");}
		fuelCapacity-=distance;

	}
}