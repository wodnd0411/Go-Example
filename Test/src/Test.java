
public class Test {

	public static void main(String[] args) {
		Child c = new Child();
		c.x = 10;
		c.y = 20;
		c.z = 30;
		
		Parent p = new Child();
		p.x = 1;
		p.y = 2;
//		p.z = 3; // ºÒ°¡´É
	}
	
}

class Parent {
	
	int x;
	int y;

	Parent() {
		this(0, 0);
	}
	
	Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

class Child extends Parent {
	
	int z;
	
	Child() {
		this(0, 0, 0);
	}
	
	Child(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	void print() {
		
	}
	
}