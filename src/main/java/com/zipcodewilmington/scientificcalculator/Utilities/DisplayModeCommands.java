package com.zipcodewilmington.scientificcalculator.Utilities;

import java.util.*;
import java.util.Map.Entry;

import com.zipcodewilmington.scientificcalculator.Application.*;
import com.zipcodewilmington.scientificcalculator.Calculator.Calculator.DisplayMode;
import com.zipcodewilmington.scientificcalculator.Utilities.ConsoleCommands.Command;

public class DisplayModeCommands 
{
	private static Map<String, Mode> commandMap = new HashMap<>();
	
	public enum Mode {
		BINARY,
		OCTAL,
		DECIMAL,
		HEXADECIMAL,
		RETURN,
		HELP
	}
	
	
	
	static {
		commandMap = new HashMap<>();
		Map<String, Mode> tempMap = new HashMap<>();
		commandMap.put("Binary", Mode.BINARY);
		commandMap.put("Octal", Mode.OCTAL);
		commandMap.put("Decimal", Mode.DECIMAL);
		commandMap.put("Hexadecimal", Mode.HEXADECIMAL);
		commandMap.put("Return", Mode.RETURN);
		commandMap.put("Help", Mode.HELP);

		// Fill map with all the above commands, but in lower case and upper case (ie CLEAR/Clear/clear all will work)
		for (Entry<String, Mode> i : commandMap.entrySet()) {
			tempMap.put(i.getKey().toLowerCase(), i.getValue());
			tempMap.put(i.getKey().toUpperCase(), i.getValue());
		}
		for (Entry<String, Mode> i : tempMap.entrySet()) {
			commandMap.put(i.getKey(), i.getValue());
		}
	}
	
	public static void runCommand(ArrayList<String> args) {
		if (commandMap != null && commandMap.containsKey(args.get(0))) {
			run(commandMap.get(args.get(0)));
		}
		else {
			run(Mode.RETURN);
		}
	}
	
	public static ArrayList<String> prompt() {
		String input = Console.getStringInput("Enter a DISPLAY MODE to continue: ");
        String[] splited = input.split("\\s+");
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        return argus;
	}
	
	public static void fullPrompt() {
		String input = Console.getStringInput("Enter a DISPLAY MODE to continue: ");
        String[] splited = input.split("\\s+");
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        while (argus.size() < 1) {
        	argus = DisplayModeCommands.prompt();
        }
        DisplayModeCommands.runCommand(argus);
	}

	public static void run(Mode cmd) {
		switch (cmd) 
		{
			case BINARY:
				MainApplication.calc.setDisplayMode(DisplayMode.BINARY);
				Console.prln("Calculator switched to BINARY mode.");
				ConsoleCommands.run(Command.DISPLAY, null);
				return;
			case DECIMAL:
				MainApplication.calc.setDisplayMode(DisplayMode.DECIMAL);
				Console.prln("Calculator switched to DECIMAL mode.");
				ConsoleCommands.run(Command.DISPLAY, null);
				return;
			case HEXADECIMAL:
				MainApplication.calc.setDisplayMode(DisplayMode.HEXADECIMAL);
				Console.prln("Calculator switched to HEXADECIMAL mode.");
				ConsoleCommands.run(Command.DISPLAY, null);
				return;
			case OCTAL:
				MainApplication.calc.setDisplayMode(DisplayMode.OCTAL);
				Console.prln("Calculator switched to OCTAL mode.");
				ConsoleCommands.run(Command.DISPLAY, null);
				return;
			case RETURN:
				ConsoleCommands.fullPrompt();
				return;
			case HELP:
				Console.prln("Printing a list of all available commands in this menu: ");
				ArrayList<String> uniques = new ArrayList<>();
				for (Entry<String, Mode> i : commandMap.entrySet()) {
					if (!uniques.contains(i.getKey().toUpperCase())) {
						uniques.add(i.getKey().toUpperCase());
					}
				}
				Collections.sort(uniques);
				for (String s : uniques) {
					Console.prln(s);
				}
				fullPrompt();
				return;
			default:
				fullPrompt();
				return;
		}
	}
	
}
