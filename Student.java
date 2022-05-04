package Assign5;
import java.util.*;
	
	public abstract class Student
	{
	    private String id;
	    private String lastName;
	    protected double tuition;
	    public Student(String id, String name)
	    {
	        this.id = id;
	        this.lastName = name;
	    }
	    public void setId(String idNumber)
	    {
	        this.id = idNumber;
	    }
	    public void setLastName(String name)
	    {
	    	this.lastName = name;
	    }
	    public String getId()
	    {
	    	return id;
	    }
	    public String getLastName()
	    {
	        return lastName;
	    }
	    public double getTuition()
	    {
	        return tuition;
	    }
	    public abstract void setTuition();
	}
