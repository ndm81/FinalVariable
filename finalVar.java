class Car{
	final int speed=100;
	void run(){
		System.out.println("Speed of the car is " +speed);
	    speed=120;
	}

	public static void main(String[] args) {
		Car c=new Car();
		    c.run(); // cannot assign a value to final variable speed=120;
            
	}}