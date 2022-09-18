package inheritance;

class Camera {
	public String brand;
	public  double cost;

	public Camera() {
		this.brand = "Nikon";
	}
    

}

class DigitalCamera extends Camera {
	private int memory;

	public DigitalCamera(String brand, double cost) {
		this.memory = 16;
		this.brand=brand;
		this.cost=cost;
	}
    
    public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
}

class Tester {
	public static void main(String[] args) {
        DigitalCamera camera = new DigitalCamera("Canon",100);
        System.out.println(camera.brand+" "+camera.cost+" "+camera.getMemory());
    }
}
