package com.siv.dependant;

import com.siv.dependable.Dependable;

public class Dependant {

	public static void main(String[] args) {
		System.out.format("Dependant picks a message. It says, \"%s\"!\n", Dependable.message());
	}

}
