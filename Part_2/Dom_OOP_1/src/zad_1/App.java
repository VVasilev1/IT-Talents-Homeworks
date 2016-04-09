package zad_1;

public class App {

	public static void main(String[] args) {
		Computer pc = new Computer(2005,200.99,10000,9000,"Linux");
		Computer laptop = new Computer(2008,350.99,20000,18000,"Windows");
		
		laptop.useMemory(100);
		pc.changeOperationSystem("Windows");
		
		
		System.out.println(pc.year + " " + pc.price+ " " +pc.hardDiskMemory+ " "+ pc.freeMemory+
				" " + pc.operationSystem);
		
		System.out.println(laptop.year + " " + laptop.price+ " " +laptop.hardDiskMemory+ " "+ laptop.freeMemory+
				" " + laptop.operationSystem);

	}

}
