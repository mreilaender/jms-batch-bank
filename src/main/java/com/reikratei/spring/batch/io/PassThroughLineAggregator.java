package com.reikratei.spring.batch.io;

import org.springframework.batch.item.file.transform.LineAggregator;

import com.reikratei.spring.batch.entities.Number;

public class PassThroughLineAggregator<T> implements LineAggregator<com.reikratei.spring.batch.entities.Number> {

	@Override
	public String aggregate(Number item) {
		return "" + item.getNumber();
	}
}