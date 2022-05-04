package Assign5;

public class DemoCandles {

	public static void main(String[] args) {
		Candle candle = new Candle();
		candle.setColor("pink");
		candle.setHeight(6);
		
		ScentedCandle TheScentCandle = new ScentedCandle();
		TheScentCandle.setColor("white");
		TheScentCandle.setHeight(6);
		TheScentCandle.setScent("gardenia");
		
		
		System.out.println("The "+candle.getHeight()+" inch "+candle.getColor()+" candle costs $"+ candle.getPrice());
		System.out.println("The "+TheScentCandle.getHeight()+" inch "+TheScentCandle.getScent()+" "+TheScentCandle.getColor()
		+" candle costs $"+ TheScentCandle.getPrice());
	}

}
