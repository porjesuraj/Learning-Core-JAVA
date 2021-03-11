package test;

public enum TrafficLight {
	RED(1),
	YELLOW(2),
	GREEN(3);
	private int time;

	TrafficLight(int r){
	 this.time = r;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	
}
