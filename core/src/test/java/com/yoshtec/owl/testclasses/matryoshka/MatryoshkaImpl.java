package com.yoshtec.owl.testclasses.matryoshka;

import com.yoshtec.owl.annotations.OwlClassImplementation;
import com.yoshtec.owl.annotations.OwlDataProperty;
import com.yoshtec.owl.annotations.OwlDataType;
import com.yoshtec.owl.annotations.OwlIndividualId;
import com.yoshtec.owl.annotations.OwlObjectProperty;
import com.yoshtec.owl.annotations.oprop.OwlInverseObjectProperty;

@OwlClassImplementation(Matryoshka.class)
public class MatryoshkaImpl implements Matryoshka {

	@OwlDataProperty(uri="http://www.yoshtec.com/ontology/test/matryoshka#Color") 
	@OwlDataType(uri="http://www.w3.org/2001/XMLSchema#string")
	private String color = null; 
	
	@OwlDataProperty(uri="http://www.yoshtec.com/ontology/test/matryoshka#Size") 
	@OwlDataType(uri="http://www.w3.org/2001/XMLSchema#int")
	private Integer size = null; 
	
	@OwlObjectProperty(uri="http://www.yoshtec.com/ontology/test/matryoshka#Contained_in") 
	@OwlDataType(uri="http://www.yoshtec.com/ontology/test/matryoshka#Matryoshka") 
	private Matryoshka contained_in = null;
	
	@OwlObjectProperty(uri="http://www.yoshtec.com/ontology/test/matryoshka#Contains") 
	@OwlInverseObjectProperty(inverse="http://www.yoshtec.com/ontology/test/matryoshka#Contains")
	@OwlDataType(uri="http://www.yoshtec.com/ontology/test/matryoshka#Matryoshka") 
	private Matryoshka contains = null;

	@OwlIndividualId
	private String name = null;
	
	public MatryoshkaImpl(){
		
	}
	
	public MatryoshkaImpl(String name){
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Matryoshka getContained_in() {
		return contained_in;
	}

	public void setContained_in(Matryoshka contained_in) {
		this.contained_in = contained_in;
	}

	public Matryoshka getContains() {
		return contains;
	}

	public void setContains(Matryoshka contains) {
		this.contains = contains;
	}
	
	@Override
    public String toString(){
		return String.format("Matryoshka  %s@%08x, %10s, %05d, %08x, %08x", name, hashCode(), color, size, (contains != null ? contains.hashCode() : 0), (contained_in != null ? contained_in.hashCode() : 0) );
	}
}
