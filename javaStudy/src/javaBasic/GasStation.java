package javaBasic;

public class GasStation{
	public static void main(String[]args){
		GasStation gasStation = new GasStation(); //gasStation인스턴스 생성
		Suv suv = new Suv(); //suv 인스턴스 생성
		Truck truck = new Truck(); //truck 인스턴스 생성
		Bus bus = new Bus(); //bus 인스턴스 생성

		//gasStation에서 suv에 기름을 넣습니다.
		gasStation.fill(suv);

		//gasStation에서 truck에 기름을 넣습니다.
		gasStation.fill(truck);

		//gasStation에서 bus에 기름을 넣습니다.
		gasStation.fill(bus);
		
	}

//	public void fill(Suv suv){
//		System.out.println("Suv에 기름을 넣습니다.");
//		suv.gas += 10;
//		System.out.println("기름이 "+suv.gas+"리터 들어있습니다.");
//	}
//
//	public void fill(Truck truck){
//		System.out.println("Truck에 기름을 넣습니다.");
//		truck.gas += 10;
//		System.out.println("기름이 "+truck.gas+"리터 들어있습니다.");
//	}
//
//	public void fill(Bus bus){
//		System.out.println("Bus에 기름을 넣습니다.");
//		bus.gas += 10;
//		System.out.println("기름이 "+bus.gas+"리터 들어있습니다.");
//	}
	

	public void fill(Car car){
		//참고. car.getClass().getName()은 car오브젝트가 실제로 어떤 클래스인지를 알려줍니다.
	 	System.out.println(car.getClass().getName()+"에 기름을 넣습니다.");

	 	car.gas += 10;
	 	System.out.println("기름이 "+car.gas+"리터 들어있습니다.");
	}
//	GasStation코드를 살펴보면 3개의 fill메소드가 있습니다. 
//	매개변수로 받아들이는 3종류의 다른 차량에 대해서 기름을 넣어주는 동작을 하는것 뿐인데 3개의 중복된 코드가 들어있어서 비효율적인데요.
//	Car클래스에 있는 gas라는 속성을 공통적으로 사용하므로 이럴경우 fill메소드의 매개변수를 Car로 하면 됩니다.
//	그러면 Suv,Truck,Bus클래스가 Car클래스로 형변환 되므로 하나의 fill메소드로도 같은 동작을 할 수 있습니다.
//	GetStation클래스에 정의되어 있는 3개의 fill메소드를 지우고, 가장 아래에 주석처리되어있는 fill메소드의 주석을 해제한 다음 실행을 눌러보세요.
//	이제 하나의 fill메소드로 같은 동작을 할 수 있습니다.
}
