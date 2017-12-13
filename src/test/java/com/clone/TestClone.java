package com.clone;

import org.junit.Test;

public class TestClone {

	@Test
	public void test() {
		Tsss t1 = new Tsss(1, "myname");
		Tsss t2 = (Tsss) t1.clone();
		t2.setId(2);
		t2.setName("myname2");
		System.out.println(t1.getId() + ":" + t1.getName());
		System.out.println(t2.getId() + ":" + t2.getName());
	}

	public class Tsss implements Cloneable {
		private int id;
		private String name;

		public Tsss(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		protected Object clone() {
			Object clone = null;

			try {
				clone = super.clone();

			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}

			return clone;
		}

	}

}
