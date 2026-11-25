package com.nit.rsmt;

public class Student
{

String name ;
int id;
String address;
String adharno;

public Student(String name, int id, String address, String adharno) 
{
	super();
	this.name = name;
	this.id = id;
	this.address = address;
	this.adharno = adharno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getAdharno() {
	return adharno;
}

public void setAdharno(String adharno) {
	this.adharno = adharno;
}

@Override
public String toString() 
{
	return "Student [name=" + name + ", id=" + id + ", address=" + address + ", adharno=" + adharno + "]";
}

}


