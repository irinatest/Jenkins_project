package com.TestGruyereThucySimple;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@Suite.SuiteClasses({
	LogInTest.class,
	AddNewSnippetTest.class,
	UploadTest.class,
	})
@RunWith(Suite.class)
public class TestSuite {

}
