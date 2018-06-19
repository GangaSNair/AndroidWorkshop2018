public class SolidDriver{
	public static void main(String[] args) {
	Cube c=new Cube();
	Sphere s=new Sphere(10);
	Cuboid cu=new Cuboid();
	Cylinder cy=new Cylinder();
	
	System.out.println("Cube");
	c.setLateralSurfaceArea();
	c.setTotalSurfaceArea();
	c.setVolume();
	c.getVolume();
	c.getLateralSurfaceArea();
	c.getTotalSurfaceArea();

	System.out.println("Sphere");
	s.setLateralSurfaceArea();
	s.setTotalSurfaceArea();
	s.setVolume();
	s.getVolume();
	s.getLateralSurfaceArea();
	s.getTotalSurfaceArea();
	
	System.out.println("Cuboid");
	cu.setLateralSurfaceArea();
	cu.setTotalSurfaceArea();
	cu.setVolume();
	cu.getVolume();
	cu.getLateralSurfaceArea();
	cu.getTotalSurfaceArea();

	System.out.println("Cylinder");
	cy.setLateralSurfaceArea();
	cy.setTotalSurfaceArea();
	cy.setVolume();
	cy.getVolume();
	cy.getLateralSurfaceArea();
	cy.getTotalSurfaceArea();
	
	
	}
}