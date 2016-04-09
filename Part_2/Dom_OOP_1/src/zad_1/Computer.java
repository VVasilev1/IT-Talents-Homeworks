package zad_1;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	
	Computer (int year, double price, int hardDiskMemory, int freeMemory, String operationSystem) {
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}
	
	void changeOperationSystem(String operationSystem) {
		if (operationSystem != null && !operationSystem.equals("")) {
			this.operationSystem = operationSystem;
		}
	}
	
	void useMemory(int memory) {
		if (memory > freeMemory) {
			System.out.println("Not enought memory");
		}
		else {
			freeMemory -= memory;
		}
	}

}
