package com.ecodation.utils;

import com.ecodation.controller.RegisterController;

public class MainTest {

	public static void main(String[] args) {

	//DbConnectionUtil.dbConnectionUtilMethod();
		RegisterController registerController=new RegisterController();
		registerController.setResult(true);
		registerController.resultMethod();

	}

}
