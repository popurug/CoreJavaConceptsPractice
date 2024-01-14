package com.javadatatypes;

import java.math.BigInteger;

public class ExtractPrimitiveTypeValueFromBigintegerValue {

	public static void main(String[] args) {

		BigInteger bigval = BigInteger.valueOf(Long.MAX_VALUE);
		System.out.println("\n BigInteger value: " + bigval);
		long valLong = bigval.longValue();
		System.out.println("\n Convert the said BigInteger to an long value: " + valLong);
		int valInt = bigval.intValue();
		System.out.println("\n Convert the said BigInteger to an int value: " + valInt);
		short valShort = bigval.shortValue();
		System.out.println("\n Convert the said BigInteger to an short value: " + valShort);
		byte valByte = bigval.byteValue();
		System.out.println("\n Convert the said BigInteger to an byte value: " + valByte);
		long valExactLong = bigval.longValueExact();
		System.out.println("\n Convert the said BigInteger to an exact long: " + valExactLong);
	}

}
