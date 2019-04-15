package com.April14;

public class Test {

	public static void main(String[] args) {
		System.out.println("--------creating employee object---------");
		Employee emp=new Employee();
		System.out.println(Employee.department);
		Employee.work();
		emp.salary=90000;
		emp.getPaid();
		
		System.out.println("--------creating scrum team object---------");
		ScrumTeam st=new ScrumTeam();
		ScrumTeam.work();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog,Sprint Backlog, BurnDown Chart";
		st.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		st.attendScrumMeeting();
		st.workOnArtifacts();
		
		System.out.println("--------creating developer object---------");
		Developer dev=new Developer();
		Developer.work();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprit Backlog";
		dev.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeeting();
		dev.code();
		
		System.out.println("--------creating tester object---------");
		Tester qa=new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprit Backlog";
		qa.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeeting();
		qa.test();
		
		FrontEnd fe=new FrontEnd();
		fe.salary=120000;
		fe.getPaid();
		fe.code();
		fe.artifacts="Sprit Backlog";
		fe.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		fe.attendScrumMeeting();
		fe.workOnArtifacts();
		
		BackEnd be=new BackEnd();
		be.salary=120000;
		be.getPaid();
		be.code();
		be.artifacts="Sprit Backlog";
		be.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		be.attendScrumMeeting();
		be.workOnArtifacts();
		
		
		
	
	
		
		

	}

}
