package com.xdevsoftware;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import one.microstream.storage.embedded.types.EmbeddedStorage;
import one.microstream.storage.embedded.types.EmbeddedStorageManager;

public class Demo
{
	


	public static void main(final String[] args) throws Exception
	{
		new Thread(() -> System.out.println("Hello lambda")).start();
		System.out.println(BeanUtils.describe("Hello bean"));
		
		List<LocalDateTime> runs = new ArrayList<>();

		// Initialize a storage manager ("the database") with purely defaults.
		final EmbeddedStorageManager storage = EmbeddedStorage.start(runs);
		
		runs.add(LocalDateTime.now());
		runs.stream().forEach(System.out::println);
		
		// store
		storage.storeRoot();

		// shutdown storage
		storage.shutdown();
		
	}
	
}
