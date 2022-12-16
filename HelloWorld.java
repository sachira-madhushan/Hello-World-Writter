import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
class HelloWorld{
	public static void main(String [] a){
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("----------Hello World---------");
		System.out.println("------------------------------");
		System.out.println("developed by sachira madhushan");
		System.out.println("------------------------------");
		System.out.println();
		System.out.println();
		System.out.print("[?]Enter name for your output file :");
		String fileName=sc.nextLine();
		System.out.println();
		System.out.println();
		System.out.println("------------Languages----------");
		System.out.println();
		System.out.println("\t[1]python");
		System.out.println("\t[2]java");
		System.out.println("\t[3]c++");
		System.out.println();
		System.out.println();
		System.out.print("[?]Select your language :");
		int option=sc.nextInt();
		
		switch(option){
			case 1:
				try{
					
					FileWriter myWriter = new FileWriter(fileName+".py");
					myWriter.write("#hello world program written by hello world software\nprint(\"Hello World!\")");
					myWriter.close();
					System.out.println("[+]your file has been successfully created!");
				}
				catch(Exception e){
					System.out.println("[!]An unknown error occurred!");
					
				}
				
				break;
			case 2:
				try{
					FileWriter myWriter2 = new FileWriter(fileName+".java");
					myWriter2.write("//hello world program written by hello world software\nclass "+fileName+"{\n\t public static void main(String[]arg){\n\t\tSystem.out.println(\"Hello World!\")}}");
					myWriter2.close();
					System.out.println("[+]your file has been successfully created!");
				}
				catch(Exception e){
					System.out.println("[!]An unknown error occurred!");
				}
				
				break;
			case 3:
				try{
					FileWriter myWriter3 = new FileWriter(fileName+".cpp");
					myWriter3.write("//hello world program written by hello world software\n#include <iostream>\nint main(){\n\tstd::cout << \"Hello World!\";\n\treturn 0;}");
					myWriter3.close();
					System.out.println("[+]your file has been successfully created!");

				}
				catch(Exception e){
					System.out.println("[!]An unknown error occurred!");
				}
				break;
		}
		
		
	}
}