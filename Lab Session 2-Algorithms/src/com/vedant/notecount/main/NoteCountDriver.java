package com.vedant.notecount.main;

import  java.util.Scanner;




public class NoteCountDriver {

	public static void main(String[] args) {
		
  MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
  NotesCount notesCount = new NotesCount();
  
  System.out.println("enter the size of currency dominations");
  Scanner sc = new Scanner(System.in);
  int size = sc.nextInt();
  int[]notes = new int[size];
  System.out.println("enter the currency dominations value");
  for (int i = 0; i < size; i++) {
	  notes[i] = sc.nextInt();
  }
	System.out.println("enter the amount you want to pay");
	int amount = sc.nextInt();
	mergeSortImplementation.sort(notes,0,notes.length-1);
	notesCount.notesCountImplementation(notes, amount);
	sc.close();
   }
}