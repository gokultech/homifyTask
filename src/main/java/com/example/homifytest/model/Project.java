package com.example.homifytest.model;

import java.util.List;

public class Project {


private String id;
private String name;
private String description;
private String header;
private String title;
private String duration;
private String types;

public Project(String header, String title, String description, String duration, String types) {
	super();
	this.header      = header;
	this.title       = title;
	this.description = description;
	this.duration    = duration;
	this.types       = types;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getHeader() {
	return header;
}

public void setHeader(String header) {
	this.header = header;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDuration() {
	return duration;
}

public void setDuration(String duration) {
	this.duration = duration;
}

public String getTypes() {
	return types;
}

public void setTypes(String types) {
	this.types = types;
}
}