package SummiyaHussain;
import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String section ;

        System.out.print( "Enter your Section:");
        section=input.nextLine();

        Info info =new Info ();
        Hobby hobby=new Hobby();

        System.out.println("Name is:"+info.name);
        System.out.println("Id is:"+info.id);
        System.out.println("Your section is:"+section);
        System.out.println("Hobby is:"+hobby.hobbyName);

    }
}


/*
Name: Summiya Hussain
Id: 2012020077
Section:B
Email:cse_2012020077@lus.ac.bd
Date:17.07.2021
*/