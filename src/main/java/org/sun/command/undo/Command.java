package org.sun.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
