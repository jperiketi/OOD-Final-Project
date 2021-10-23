package com.designpatterns.ceilingfan.repository;

public interface Command {
	public void execute();
	public void undo();
}