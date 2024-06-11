package com.election.beans;

import java.util.ArrayList;
import java.util.List;

import com.election.DAO.CandidateDAO;
import com.election.DAO.CandidateDaoImpl;
import com.election.entity.Candidate;

public class CandidateListBin {
	
	public CandidateListBin()
	{
		
	}
	
	public void authenticate()
	{
		List<Candidate> candidateList = new ArrayList<Candidate>();
		try(CandidateDAO candidate = new CandidateDaoImpl())
		{
			candidateList = candidate.findAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
