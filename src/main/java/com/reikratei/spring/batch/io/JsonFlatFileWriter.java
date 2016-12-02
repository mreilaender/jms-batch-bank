package com.reikratei.spring.batch.io;

import java.io.File;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class JsonFlatFileWriter implements ItemWriter<Number> {

	private File path;

	@Override
	public void write(List<? extends Number> arg0) throws Exception {
		// TODO Auto-generated method stub

	}

	public void setResource(String resource) {
		path = new File(resource);
	}

}
