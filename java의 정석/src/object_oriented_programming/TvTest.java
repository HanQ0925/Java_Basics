package object_oriented_programming;

class Tv {
	//Tv�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;
	
	//Tv�� ���(�޼���)
	void power() {power = !power;}
	void channelUp() {++channel;}
	void ChannelDown() {--channel;}
	
}

class TvTest{
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel =7;
		t.ChannelDown();
		System.out.println("���� ä���� "+t.channel+"�Դϴ�.");
	}
}
