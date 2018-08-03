
public class TestStock {

	
	public static void main(String[] args) {
		Holder h = StockSingleton.getStock();
		h.viewQuote();
		Broker b =StockSingleton.getStock();
		b.getQuote();
		Exchange e = StockSingleton.getStock();
		System.out.println(h==e);
		
		
	}
}
