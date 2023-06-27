package com.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EmployeeServiceTest.class, HookTest.class, OperationTest.class })
public class AllTests {

}
