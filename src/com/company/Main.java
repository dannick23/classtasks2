package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int choice;
        do{
            System.out.println("input choice of task(0 to exit): ");
            try{
            choice=inpt.nextInt();
        switch (choice){
            case 1:
                System.out.println("input two numbers");
                try {
                    int aint = inpt.nextInt(), bint = inpt.nextInt();
                    System.out.println("is " + aint + " equal to " + bint + " ? - " + ((aint == bint) ? "true" : "false"));
                    System.out.println("is " + aint + " less than " + bint + " ? - " + ((aint < bint) ? "true" : "false"));
                    System.out.println("is " + aint + " less or equal to " + bint + " ? - " + ((aint <= bint) ? "true" : "false"));
                    System.out.println("is " + aint + " greater than " + bint + " ? - " + ((aint > bint) ? "true" : "false"));
                    System.out.println("is " + aint + " greater or equal to " + bint + " ? - " + ((aint >= bint) ? "true" : "false"));
                }catch (Exception e){
                    inpt.next();
                    System.out.println("Use numbers!!!");
                }
            break;
            case 2:
                System.out.println("input two boolean values");
                try{
                    boolean abool = inpt.nextBoolean(),bbool = inpt.nextBoolean();
                    System.out.println("is "+ abool + " and "+ bbool +" equal? - " + ((abool==bbool)?"true":"false") );
                }catch(Exception e){
                    inpt.next();
                    System.out.println("true or false!!!");
                }
                break;
            case 3:
                System.out.println("input whole number and check if it's even");
                try {
                    int awhole = inpt.nextInt();
                    System.out.println((awhole % 2 == 0) ? "true" : "false");
                }catch (Exception e){
                    inpt.next();
                    System.out.println("Use numbers!!!");
                }
            break;
            case 4:
                System.out.println("input whole number and check if it's odd");
                try {
                    int aodd = inpt.nextInt();
                    System.out.println((aodd % 2 == 1) ? "true" : "false");
                }catch (Exception e){
                    inpt.next();
                    System.out.println("Use numbers!!!");
                }
            break;
            case 5:
                System.out.println("input boolean value");
                try {
                    boolean anot = inpt.nextBoolean();
                    System.out.println(!anot);
                }catch(Exception e){
                    inpt.next();
                    System.out.println("true or false!!!");
                }
            break;
            case 6:
                System.out.println("input two numbers for the most random test");
                try {
                    int arand = inpt.nextInt(), brand = inpt.nextInt();
                    System.out.println((arand == brand || arand < 0 && brand > 0 || arand > 1001 && brand > 1001) ? "true" : "false");
                }catch (Exception e){
                        inpt.next();
                        System.out.println("Use numbers!!!");
                    }
            break;
            case 0: break;
            default:
                System.out.println("try again");break;
        }
            }catch(Exception e){
                choice=-1;
                inpt.next();
                System.out.println("Did you seriously mess up already?");
            }}while(choice!=0);
        }
    }