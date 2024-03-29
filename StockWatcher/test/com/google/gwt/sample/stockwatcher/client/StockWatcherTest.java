package com.google.gwt.sample.stockwatcher.client;

import org.junit.Test;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * GWT JUnit tests must extend GWTTestCase.
 */
public class StockWatcherTest extends GWTTestCase {

	/**
	 * Must refer to a valid module that sources this class.
	 */
	@Override
	public String getModuleName() {
		return "com.google.gwt.sample.stockwatcher.StockWatcher";
	}

	/**
	 * Add as many tests as you like.
	 */
	@Test
	public void testSimple() {
		assertTrue(true);
	}
	
	/**
	 * Verify that the instance fields of the class are set correctly
	 */
	@Test
	public void testStockPriceCtor() {
		String symbol = "XYZ";
		double price = 70.0;
		double change = 2.0;
		double changePercent = 100 * change / price;
		
		StockPrice sp = new StockPrice(symbol, price, change);
		assertNotNull(sp);
		assertEquals(symbol, sp.getSymbol());
		assertEquals(price, sp.getPrice(), 0.001);
		assertEquals(change, sp.getChange(), 0.001);
		assertEquals(changePercent, sp.getChangePercent(), 0.001);
	}

}