package com.company;
import javax.swing.JOptionPane;



public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Welcome to EasyKanban");     //print welcome to EasyKanban

        //creating an int array
        int intArray[][] = new int[][]{{1,2,3}};

        Outer:

        //creating for loops
        for(int i=0; i < intArray.length; i ++){
        for(int j=0; j < intArray[i].length ; j ++){
            if(intArray[i][j] == 4)
                continue Outer;
            //print option and int array
            System.out.println("Option : " + intArray[i][j]);
        }
        }
        char ch1 = '1';
        char ch2 = '2';
        char ch3 = '3';
        System.out.println("Add task :" + ch1);          //print add task and char
        System.out.println("Coming Soon :" + ch2);       //print coming soon and char
        System.out.println("Quit :" + ch3);              //print quit and char

        String[] response = {"add","soon","quit"};       //responding

        //input tasks
        //input statements
        String input = JOptionPane.showInputDialog(null,"Task Name :");
        //print return statement
        System.out.println("Login Feature");

        JOptionPane.showInputDialog(null,"Task Number");
        //print return statement
        System.out.println("Auto generated");

        JOptionPane.showInputDialog(null,"Task Description");
        //print return statement
        System.out.println("Task Feature");
        //message to the user
        JOptionPane.showMessageDialog(null,"Task successfully captured");

        String user = JOptionPane.showInputDialog(null,"Developer Details");
        //print return statement
        System.out.println("First and last name");
        JOptionPane.showMessageDialog(null,user);

        JOptionPane.showInputDialog(null,"Task Duration");
        //print return statement
        System.out.println("Total Hours");

        JOptionPane.showInputDialog(null,"Task ID");
        //print return statement
        System.out.println("Auto generated");

        //print three option
        System.out.println("1. To Do");
        System.out.println("2. Doing");
        System.out.println("3. Done");
        //select one of above task statuses
        JOptionPane.showInputDialog(null,"Task Status");
        int name = JOptionPane.showConfirmDialog(null,"Are you sure?");
        //1=yes, 2=no, 3=cancel
        System.out.println(name);

        class feature {

            public boolean checkTaskDescription(Object obj) {

                return super.equals(obj);
            }

            public String createTaskID() {

                return super.toString();
            }

            public String printTaskDetails() {

                return super.toString();
            }

            public int add (int hourA, int hourB){

                return hourA + hourB;
            }
        }

    }

}
