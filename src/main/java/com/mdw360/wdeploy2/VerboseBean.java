package com.mdw360.wdeploy2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;*/

public class VerboseBean {
	public String testProp1 = "defaultValueProp1";;
	public String testProp2 = "defaultValueProp2";

	private Logger logger = LoggerFactory.getLogger(VerboseBean.class);
	public VerboseBean() {
		logger.info("VerboseBean constructor called");
	}

	public void init() {
		logger.info("Init method called");
	}

	public void destroy() {
		logger.info("Destroy method called");
	}

	public void setTestProp1(String value) {
		logger.info("setTestProp1 called");
		this.testProp1 = value;
	}

	public String getTestProp1() {
		logger.info("getTestProp1 called");
		return this.testProp1;
	}

	public void setTestProp2(String value) {
		logger.info("setTestProp2 called");
		this.testProp2 = value;
	}

	public String getTestProp2() {
		logger.info("getTestProp2 called");
		return this.testProp2;
	}
}
