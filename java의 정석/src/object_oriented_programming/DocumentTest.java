package object_oriented_programming;

class Document{
	static int cnt = 0;
	String name;
	
	Document() {
		this("�������"+ ++cnt);
	}
	
	Document(String name){
		this.name = name;
		System.out.println("���� "+this.name+"�� �����Ǿ����ϴ�.");
	}
}

public class DocumentTest {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("�ڹ�.txt");
		Document d3 = new Document();
		Document d4 = new Document();
		
	}

}
