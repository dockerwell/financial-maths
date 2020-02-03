package org.dockerwell.test.statistics;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.dockerwell.statistics.Statistics;
import org.junit.Test;

public class StatisticsTest {
	
	@Test
	public void populationMeanTest() {
		Statistics statistics = new Statistics();
		List<Double> a= new ArrayList<Double>();
		a.add(1.0);
		a.add(2.0);
		a.add(3.0);
		a.add(4.0);
		a.add(5.0);
		a.add(6.0);
		a.add(7.0);
		a.add(8.0);
		a.add(9.0);
		a.add(10.0);
		a.add(11.0);
		a.add(12.0);
		
		assertTrue(statistics.populationMean(a) == 6.5 ? true : false);
	}
	
}
