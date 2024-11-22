package base_java;

 class Vector {
	 
	 private int dx;
	 private int dy;
	 private double length;
	 
	 public Vector(int dxInit, int dyInit) {
		 setDxDy(dxInit, dyInit);
	 }
	 
	 public void setDxDy(int newDx,int newDy) {
		 dx = newDx;
		 dy = newDy;
		 length = Math.sqrt(dx*dx + dy*dy);
	 }
	
	 public double getLength() {
		 return length;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
