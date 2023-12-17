package com.supplier;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<String> otps = () -> {

			String otp = "";

			for (int i = 0; i < 3; i++) {

				otp = otp + Math.random();
			}

			return otp;

		};
		System.out.println(otps.get());

	}
}
