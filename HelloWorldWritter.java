import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
class HelloWorldWritter{
	public static void main(String [] a){
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("-----Hello World Writter------");
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
		System.out.println("\t[4]cobol");
		System.out.println("\t[5]scala");
		System.out.println("\t[6]dart");
		System.out.println("\t[7]pascal");
		System.out.println("\t[8]ruby");
		System.out.println();
		System.out.println();
		System.out.print("[?]Select your language :");
		int option=sc.nextInt();
		
		switch(option){
			case 1:
				try{
					
					FileWriter myWriter = new FileWriter(fileName+".py");
					myWriter.write("#hello world program written by hello world writter software\nprint(\"Hello World!\")");
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
					myWriter2.write("//hello world program written by hello world writter software\nclass "+fileName+"{\n\t public static void main(String[]arg){\n\t\tSystem.out.println(\"Hello World!\");\n}\n}");
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
					myWriter3.write("//hello world program written by hello world writter software\n#include <iostream>\nint main(){\n\tstd::cout << \"Hello World!\";\n\treturn 0;\n}");
					myWriter3.close();
					System.out.println("[+]your file has been successfully created!");

				}
				catch(Exception e){
					System.out.println("[!]An unknown error occurred!");
				}
				break;
			
			case 4:
				try{
					FileWriter myWriter3 = new FileWriter(fileName+".cbl");
					myWriter3.write("//hello world program written by hello world writter software\nIDENTIFICATION DIVISION.\n PROGRAM-ID. Hello-world. \nPROCEDURE DIVISION. \n\tDISPLAY \"Hello World!\".");
					myWriter3.close();
					System.out.println("[+]your file has been successfully created!");

				}
				catch(Exception e){
					System.out.println("[!]An unknown error occurred!");
				}
				break;
			case 5:
				try{
					FileWriter myWriter3 = new FileWriter(fileName+".sc");
					myWriter3.write("//hello world program written by hello world writter software\nobject HelloWorld extends App {\n printIn(\"Hello World\") \n}");
					myWriter3.close();
					System.out.println("[+]your file has been successfully created!");

				}
				catch(Exception e){
					System.out.println("[!]An unknown error occurred!");
				}
				break;
				
				
				
			case 6:
				try{
					FileWriter myWriter3 = new FileWriter(fileName+".dart");
					myWriter3.write("//hello world program written by hello world writter software\nmain(){ \n\tprint('Hello World'); \n}");
					myWriter3.close();
					System.out.println("[+]your file has been successfully created!");

				}
				catch(Exception e){
					System.out.println("[!]An unknown error occurred!");
				}
				break;
				
			case 7:
				try{
					FileWriter myWriter3 = new FileWriter(fileName+".pas");
					myWriter3.write("//hello world program written by hello world writter software\nprogram Hello;\n begin writeln ('Hello, world.');\n end.");
					myWriter3.close();
					System.out.println("[+]your file has been successfully created!");

				}
				catch(Exception e){
					System.out.println("[!]An unknown error occurred!");
				}
				break;
				
			case 8:
				try{
					FileWriter myWriter3 = new FileWriter(fileName+".rb");
					myWriter3.write("//hello world program written by hello world writter software\nputs 'Hello World'");
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