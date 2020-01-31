package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.Administration_CourseListPOM;

public class Administration_CourseList extends LoginTests{
	
	private Administration_CourseListPOM adminCourseListPOM;

	@Test(priority=2)
	public void administrationCourseList() { 
		adminCourseListPOM = new Administration_CourseListPOM(driver); 
		adminCourseListPOM.clickAdministrationBtn();
		adminCourseListPOM.clickCourseListLink();
		adminCourseListPOM.clickOnDelImg();
		adminCourseListPOM.alertAccept();
		adminCourseListPOM.verifyMessage();
	}

}
