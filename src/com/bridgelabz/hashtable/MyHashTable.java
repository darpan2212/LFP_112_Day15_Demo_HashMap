package com.bridgelabz.hashtable;

import java.util.Arrays;

public class MyHashTable<K, V> {

	int bucketSize;
	MyHashMap<K, V>[] myBucketList;

	public MyHashTable(int bucketSize) {
		this.bucketSize = bucketSize;
		myBucketList = new MyHashMap[bucketSize];
	}

	public void add(K key, V value) {
		int bucketIndex = Math
				.abs(key.hashCode() % bucketSize);
		if (myBucketList[bucketIndex] == null) {
			myBucketList[bucketIndex] = new MyHashMap<>();
		}
		myBucketList[bucketIndex].add(key, value);
	}

	public V get(K key) {
		int bucketIndex = Math
				.abs(key.hashCode() % bucketSize);
		if (myBucketList[bucketIndex] == null) {
			myBucketList[bucketIndex] = new MyHashMap<>();
		}
		return myBucketList[bucketIndex].get(key);
	}

	public void printAllList() {
		for (int i = 0; i < myBucketList.length; i++) {
			if (myBucketList[i] != null) {
				System.out.println("BucketIndex : " + i
						+ " : " + myBucketList[i]);
			}
		}
	}
}