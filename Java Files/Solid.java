public abstract class Solid{
	
	protected float totalSurfaceArea;
	protected float volume;
	protected float lateralSurfaceArea;
	
	abstract void setTotalSurfaceArea();
	abstract void setLateralSurfaceArea();
	abstract void setVolume();

	public void getVolume(){
		System.out.println("The volume is "+volume);
	}
	public void getTotalSurfaceArea(){
		System.out.println("The total Surface Area is "+totalSurfaceArea);
	}
	public void getLateralSurfaceArea(){
		System.out.println("The lateral Surface Area is "+lateralSurfaceArea);
	}
}