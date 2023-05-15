package com.masai;

public class WorkoutProgram {
	private int programId;
	private String programName;
	private int programDuration;
	
	public WorkoutProgram(int programId, String programName, int programDuration) {
		super();
		this.programId = programId;
		this.programName = programName;
		this.programDuration = programDuration;
	}
	
	@Override
	public String toString() {
		return "WorkoutProgram [programId=" + programId + ", programName=" + programName + ", programDuration="
				+ programDuration + "]";
	}
	
	

}
