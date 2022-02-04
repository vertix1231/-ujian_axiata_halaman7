package com.juaracoding.restassured;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.Scanner;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class MainTest_CRUD {
	private Test01_POST test01_POST;
	private Test02_1_GET test02_1_GET;
	private Test02_2_PATCH test02_2_PATCH;
	private Test03_PUT test03_PUT;
	private Test06_DELETE test06_DELETE;
	
	
	/*
	 * https://reqres.in/
	 * https://www.youtube.com/watch?v=mkIliGAePBM&ab_channel=AutomationStepbyStep
	 */
	
	@Test(priority = 0)
	public void test01_post() {
		
		test01_POST = new Test01_POST();
		
		test01_POST.test01_post();
		
		System.out.println("test post selesai");

	}
	@Test(priority = 1)
	public void test02_get() {
		Scanner sc = new Scanner(System.in);
		System.out.println("masukan id user post terbaru metode get: ");
		int inputid=sc.nextInt();
		
		test02_1_GET = new Test02_1_GET();
		test02_1_GET.test_01();
		test02_1_GET.test_02(inputid);
		
		System.out.println("test get selesai");

	}
	@Test(priority = 2)
	public void test03_patch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("masukan id user dan nama patch terbaru metode : ");
		int inputid=sc.nextInt();
//		System.out.println("");
		String inputnama = sc.next();
		
		test02_2_PATCH = new Test02_2_PATCH();
		test02_2_PATCH.test03_patch(inputid,inputnama);
//		test02_2_PATCH.test03_2patch(inputid);
		
		System.out.println("test patch selesai");

	}
	@Test(priority = 3)
	public void test04_put() {
		Scanner sc = new Scanner(System.in);
		System.out.println("masukan id user dan nama put terbaru metode : ");
		int inputid=sc.nextInt();
		String inputnama = sc.next();
		
		test03_PUT = new Test03_PUT();
		test03_PUT.test02_put(inputid,inputnama);

	}
	@Test(priority = 4)
	public void test04_delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("masukan id user dan nama delete terbaru metode : ");
		int inputid=sc.nextInt();
		String inputnama = sc.next();
		
		test06_DELETE = new Test06_DELETE();
		test06_DELETE.test04_delete(inputid, inputnama);
		

	}
	
	

}
