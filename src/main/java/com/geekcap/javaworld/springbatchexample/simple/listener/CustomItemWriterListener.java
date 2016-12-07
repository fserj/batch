package com.geekcap.javaworld.springbatchexample.simple.listener;

import java.util.List;

import org.springframework.batch.core.ItemWriteListener;

import com.geekcap.javaworld.springbatchexample.simple.model.Product;

public class CustomItemWriterListener implements ItemWriteListener<Product> {

	@Override
	public void beforeWrite(List<? extends Product> items) {
		System.out.println("ItemWriteListener - beforeWrite");
	}

	@Override
	public void afterWrite(List<? extends Product> items) {
		System.out.println("ItemWriteListener - afterWrite");
	}

	@Override
	public void onWriteError(Exception exception, List<? extends Product> items) {
		System.out.println("ItemWriteListener - onWriteError");
	}

}