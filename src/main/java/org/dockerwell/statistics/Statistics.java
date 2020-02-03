package org.dockerwell.statistics;

import java.util.List;
import java.util.OptionalDouble;

public class Statistics {
	public Double populationMean(List<Double> groupCharaceterstics) {
		OptionalDouble mean = null;
		if (!groupCharaceterstics.isEmpty()) {
			mean = groupCharaceterstics.stream().mapToDouble(c -> c).average();
		}
		return mean.getAsDouble();
	}
}
