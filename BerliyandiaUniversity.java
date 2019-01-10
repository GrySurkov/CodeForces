package ru.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//http://codeforces.com/problemset/problem/1090/L

public class BerliyandiaUniversity {

	public static void main(String[] args) throws IOException {
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		String sIn = in.readLine();
		int students, lesson, room1, room2, minLesson, answer;
		StringTokenizer pars = new StringTokenizer(sIn, " ");
		students = Integer.parseInt(pars.nextToken());
		lesson = Integer.parseInt(pars.nextToken());
		room1 = Integer.parseInt(pars.nextToken());
		room2 = Integer.parseInt(pars.nextToken());
		minLesson = Integer.parseInt(pars.nextToken());
		answer = 0;

	}

	public class Student {
		int visitOnLesson = 0;

		public Student create(int i) {
			 String name = String.valueOf(i);
			 Student name = new Student();
			 
			
			 return 
			 
		 }
	}

}

// создать обект студента с переменно количество посещенных занятий, когда норму выполнит можно не ходить.
