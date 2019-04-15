package com.April14;

public class ScrumTeam extends Employee {
	public String artifacts;
	public String ceremonies;
	
	public void workOnArtifacts() {
		System.out.println("Scrum team work on "+artifacts);
	}
	public void attendScrumMeeting() {
		System.out.println("Scrum team attends "+ceremonies);
	}
	

}
