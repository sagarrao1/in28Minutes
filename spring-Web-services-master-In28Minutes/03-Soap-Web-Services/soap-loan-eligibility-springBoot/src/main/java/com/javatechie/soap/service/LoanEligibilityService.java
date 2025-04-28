package com.javatechie.soap.service;

import java.nio.file.attribute.AclEntry.Builder;
import java.util.List;
import org.springframework.stereotype.Service;
import com.javatechie.soap.loan_eligibility.AcknowledgementResponse;
import com.javatechie.soap.loan_eligibility.CustomerRequest;

@Service
public class LoanEligibilityService {	
	public AcknowledgementResponse checkLoanEiligibility(CustomerRequest request) {
		
		AcknowledgementResponse resp= new AcknowledgementResponse();		
		List<String> mismatchCriteriaList = resp.getCriteriaMismatch();
		
		if( !(request.getAge()>30 && request.getAge()<=60)) {
			mismatchCriteriaList.add("Person age should be in between 30 to 60");
		}		
		if( !(request.getYearlyIncome() > 200000)) {
			mismatchCriteriaList.add("Minimun Annual income should be grater than 2 lakhs");
		}		
		if( !(request.getCibilScore() > 500)) {
			mismatchCriteriaList.add("Low Cibil score. apply after 6 months");
		}
		
//		Builder response
		if (mismatchCriteriaList.size() >0) {
			resp.setIsEligible(false);
			resp.setApprovedAmount(0);			
		} else {
			mismatchCriteriaList.clear();
			resp.setApprovedAmount(500000);
			resp.setIsEligible(true);			
		}		
		
		return resp;
	}

}
