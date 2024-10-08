package com.xworkz.sorted.runner;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public class Function {

	public static void main(String[] args) {
		// 1
		Consumer<Boolean> consumer = (Boolean b) -> {
			System.out.println("Accept in Functional runner : " + b);
		};
		
		System.out.println("---------------");

		// 2
		BiConsumer<String, Integer> biConsumer = (name, age) -> {
			System.out.println("Name :" + name + " , " + "age :" + age);
		};
		
		System.out.println("---------------");

		// 3
		Supplier<Boolean> supplier = () -> {
			System.out.println("Supplier invoked");
			return true;
		};
		
		System.out.println("++++++++++++++++");
		// 4
		Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println(isEven.test(4)); 
		
		System.out.println("++++++++++++++++++++++");

		// 5
		BiFunction<Integer, Integer, String> biFun = (i, I) -> {
			System.out.println("Bi Function :" + i + " , " + I);
			return "Current Year";

		};
		String ref = biFun.apply(2023, 2024);
		System.out.println(ref);
		System.out.println("++++++++++++++++++++");

		// 6
		Predicate<String> pre = (String s) -> {
			System.out.println(s);
			return false;
		};
		
		System.out.println("++++++++++++++++++++");

		// 7
		BiPredicate<Double, Double> biPredicate = (d, D) -> {
			System.out.println(d);
			System.out.println(D);
			return false;
		};
		
		System.out.println("+++++++++++++++++++++");

		// 8
		UnaryOperator<Long> unaryOperation = (mobileNo) -> {
			System.out.println(mobileNo);
			return 9952644296L;
		};
		
		System.out.println("+++++++++++++++++++++");

		// 9
		BinaryOperator<Integer> binaryOperator = (a, b) -> {
			System.out.println(a);
			System.out.println(b);
			return 2;
		};
		
		System.out.println("++++++++++++++++++++++");

		// 10
		IntConsumer consumer1 = (int value) -> {
			System.out.println("Accept in lambda runner : " + value);
		};
		
		System.out.println("++++++++++++++++++++++++");

		// 11
		IntSupplier intSupplier = () -> {
			System.out.println("IntSupplier Method");
			return 50;
		};
		
		System.out.println("+++++++++++++++++++++++");

		// 12
		IntFunction<String> intFunction = (val) -> {
			System.out.println("IntFunction method");
			String fun = "The value is: " + val;
			return fun;
		};
		
		System.out.println("+++++++++++++++++++++++");

		// 13
		IntPredicate intPredicate = (int score) -> {
			System.out.println("intPredicte method");
			System.out.println(score);
			return true;
		};
		
		System.out.println("+++++++++++++++++++++");

		// 14
		IntUnaryOperator intUnary = (int operand) -> {
			System.out.println("IntUnaryOperator method");
			System.out.println(operand);
			return operand;
		};
		
		System.out.println("++++++++++++++++++++++++");

		// 15
		IntBinaryOperator intBinary = (left, right) -> {
			System.out.println("left value :" + left);
			System.out.println("right value :" + right);
			return left;
		};
		
		System.out.println("+++++++++++++++++++++++++");

		// 16
		LongConsumer longConsumer = (accountNo) -> {
			System.out.println("LongConsumer method");
			System.out.println("Account No: " + accountNo);
		};
		
		System.out.println("+++++++++++++++++++++++");

		// 17
		LongSupplier longSupplier = () -> {
			System.out.println("LongSupplier method");
			return 123456789L;
		};
		
		System.out.println("++++++++++++++++++++++++");

		// 18
		LongFunction<String> longFunction = (population) -> {
			System.out.println("LongFunction method");
			System.out.println("India Population :" + population);
			return "India";
		};
		
		System.out.println("+++++++++++++++++");

		// 19
		LongPredicate longPredicate = (store) -> {
			System.out.println("Long predicate method");
			System.out.println("Stored Data :" + store);
			return false;
		};
		
		System.out.println("++++++++++++++++++++++++");

		// 20
		LongUnaryOperator longUnaryOperator = (phone) -> {
			System.out.println("PhoneNo: " + phone);
			return phone;
		};
		
		System.out.println("++++++++++++++++++++++");

		// 21
		LongBinaryOperator longBinary = (binary, Binary) -> {
			System.out.println(binary);
			System.out.println(Binary);
			return binary;
		};
		
		System.out.println("++++++++++++++++++++");

		// 22
		DoubleConsumer doubleConsumer = (price) -> {
			System.out.println("double Consumer method");
		};
	
		System.out.println("++++++++++++++++++++++");

		// 23
		DoubleSupplier doubleSupplier = () -> {
			System.out.println("Double supplier method");
			return 1000;
		};
		
		System.out.println("+++++++++++++++++++++");

		// 24
		DoubleFunction<String> doubleFunction = value5 -> "Double value: " + value5;
		System.out.println(doubleFunction.apply(10.5));
		System.out.println("++++++++++++++++++++");

		// 25
		DoublePredicate doublePredicate = (double cost) -> {
			System.out.println(cost);
			return true;
		};
		
		System.out.println("++++++++++++++++++++++++++");

		// 26
		DoubleUnaryOperator doubleUnaryOperator = (operand) -> {
			System.out.println(operand);
			return 300;
		};
		
		System.out.println("++++++++++++++++++++");

		// 27
		DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a * b;
		System.out.println("DoubleBinaryOperator result: " + doubleBinaryOperator.applyAsDouble(2.0, 3.0));
		System.out.println("+++++++++++++++++++");

		// 28
		ToIntFunction<String> toIntFunction = str -> str.length();
		System.out.println("ToIntFunction length: " + toIntFunction.applyAsInt("Hello"));
		System.out.println("+++++++++++++++++++");

		// 29
		ToDoubleFunction<String> toDoubleFunction = str -> str.length() * 1.0;
		System.out.println("ToDoubleFunction length: " + toDoubleFunction.applyAsDouble("Hello"));
		System.out.println("+++++++++++++++++++++++");

		// 30
		ToLongFunction<String> toLongFunction = str -> str.length();
		System.out.println("ToLongFunction length: " + toLongFunction.applyAsLong("Hello"));
		System.out.println("++++++++++++++++++++++");

		// 31
		ToIntBiFunction<String, String> toIntBiFunction = (s1, s2) -> (s1 + s2).length();
		System.out.println("ToIntBiFunction combined length: " + toIntBiFunction.applyAsInt("Hello", "World"));
		System.out.println("+++++++++++++++++++++++");

		// 32
		ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (a, b) -> (a + b) / 2.0;
		System.out.println("ToDoubleBiFunction average: " + toDoubleBiFunction.applyAsDouble(10, 20));
		System.out.println("+++++++++++++++++++");

		// 33
		ToLongBiFunction<Integer, Integer> toLongBiFunction = (a, b) -> a + b;
		System.out.println("ToLongBiFunction sum: " + toLongBiFunction.applyAsLong(10, 20));
		System.out.println("++++++++++++++++++++++++");

		// 34
		ObjIntConsumer<Integer> objInt = (size, quantity) -> {
			System.out.println("ObjIntConsumer method");
			System.out.println(size);
			System.out.println(quantity);
		};
		
		System.out.println("++++++++++++++++++++");

		// 35
		ObjDoubleConsumer<String> objDouble = (name, exp) -> {
			System.out.println("Name : " + name);
			System.out.println("Experience :" + exp);
		};
		
		System.out.println("++++++++++++++++++++");

		// 36
		ObjLongConsumer<String> objLong = (name, mobileNumber) -> {
			System.out.println("Name :" + name);
			System.out.println("Mobile :" + mobileNumber);
		};
		
		System.out.println("++++++++++++++++");

		// 37
		IntToDoubleFunction intToDouble = (int currentYear) -> {
			System.out.println(currentYear);
			return currentYear;
		};
		
		System.out.println("++++++++++++++++++");

		// 38
		IntToLongFunction intToLong = (int pastYear) -> {
			System.out.println("Past Year :" + pastYear);
			return 867362820L;
		};
		
		System.out.println("+++++++++++++++++++");

		// 39
		DoubleToIntFunction doubleToInt = (double d) -> {
			System.out.println(d);
			return 2;
		};
		
		System.out.println("+++++++++++++++++++++");


		// 40
		LongToIntFunction longToIntFunction = (assign) -> (int) assign;
		System.out.println("LongToIntFunction: " + longToIntFunction.applyAsInt(10000L));
		
		System.out.println("++++++++++++++++++");

		// 41
		DoubleToLongFunction doubleToLongFunction = (toLong) -> (long) toLong;
		System.out.println("DoubleToLongFunction: " + doubleToLongFunction.applyAsLong(3.14));
		
		System.out.println("+++++++++++++++++");

		// 42
		LongToDoubleFunction longToDoubleFunction = (toDouble) -> toDouble / 2.0;
		System.out.println("LongToDoubleFunction: " + longToDoubleFunction.applyAsDouble(10000L));
		
		System.out.println("+++++++++++++++++++++");

	}

}
