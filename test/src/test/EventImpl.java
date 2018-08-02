package test;

public class EventImpl implements Event {

	@Override
	public void doSomething() {
		System.out.println("First event Implementation");
	}

	public static class InnerEventImpl implements Event {

		@Override
		public void doSomething() {
			System.out.println("Second event Implementation");
		}

	}

	public void doingSomething() {

		class InnerMostImpl implements Event {

			@Override
			public void doSomething() {

				System.out.println("Third event Implementations");
			}

		}
		;

		new InnerMostImpl().doSomething();
	}

	
	//anonymous 
	public void doingSomethingAgain() {

		Event e = new Event() {

			@Override
			public void doSomething() {
				System.out.println("Fourth event Implementation");
			}
		};
		e.doSomething();
	}

	//lambda
	public void doingSomethingoneLastTime() {

		Event e = () -> System.out.println("Fifth event Implementation");

		e.doSomething();
	}

	public static void main(String[] args) {
		EventImpl impl = new EventImpl();
		impl.doSomething();

		// InnerEventImpl innerImpl = impl.new InnerEventImpl();
		// InnerEventImpl innerImpl = new EventImpl.InnerEventImpl();
		// innerImpl.doSomething();

		InnerEventImpl inn = new InnerEventImpl();
		inn.doSomething();

		impl.doingSomething();
		impl.doingSomethingAgain();
		impl.doingSomethingoneLastTime();

	}

}
