package com.rabo.statementprocessor.validation;

import java.util.ArrayList;

public class FailedRecordReferences {

	public static void duplicates(ArrayList<String> failed) {
		System.out.println("failed record references");
		for (String failedRecords : failed) {
			System.out.println(failedRecords);
		}
	}
}
