package com.JAVA_TASK;

import static java.awt.event.MouseEvent.BUTTON1;

import java.util.Date;
import java.util.Scanner;

public class OnlineReservationSystem {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "------------------------------------------------------------------"
    );
    System.out.println(
      " -----------| WELCOME TO ONLINE-RESERVATION SYSTEM |12-----------"
    );
    System.out.println(
      "------------------------------------------------------------------"
    );
    System.out.println("|\t\t\t\tPRESS BUTTON\t\t\t|            ");
    System.out.println(
      "------------------------------------------------------------------"
    );
    System.out.println("\t\t1. SIGN UP \t\t\t 2. LOGIN");
    int BUTTON;
    System.out.println(
      "------------------------------------------------------------------"
    );
    System.out.print("\t\t\t\t");
    BUTTON = sc.nextInt();
    System.out.println(
      "------------------------------------------------------------------"
    );
    switch (BUTTON) {
      case 1 -> SIGNIN();
      case 2 -> {
        System.out.println("First Create Your Account ! ");
        System.out.println(
          "------------------------------------------------------------------"
        );
        SIGNIN();
      }
      default -> {
        System.out.println(
          " ----------- |\t\t\tINCORRECT INPUT\t\t\t\t| ----------- "
        );
        System.out.println(
          "------------------------------------------------------------------"
        );
      }
    }
  }

  public static void SIGNIN() {
    Scanner sc = new Scanner(System.in);
    String id = "";
    String pw = "";
    System.out.print("Enter User ID : ");
    try {
      id = sc.next();
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }
    System.out.print("Enter password : ");
    try {
      pw = sc.next();
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }
    System.out.println(" ----------- | SIGN IN SUCCESSFULLY 👍 | -----------");
    System.out.println(
      "------------------------------------------------------------------"
    );
    LOGININ(id, pw);
  }

  public static void LOGININ(String id, String pw) {
    String L_id;
    String L_pw;
    int BUTTON1 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter User LOGIN_ID : ");
    L_id = sc.next();
    System.out.print("Enter LOGIN_Password : ");
    L_pw = sc.next();
    if (id.equals(L_id)) {
      if (pw.equals(L_pw)) {
        System.out.println(
          " ----------- | LOGIN IN SUCCESSFULLY 👍 | -----------"
        );
        System.out.println(
          "------------------------------------------------------------------"
        );
        System.out.println(" ----------- | PRESS BUTTON | ----------- ");
        System.out.println("1. Reservation System");
        try {
          BUTTON1 = sc.nextInt();
        } catch (Exception e) {
          System.out.println(e);
        }
        if (BUTTON1 == 1) {
          ReservationSystem();
        } else {
          System.out.println(
            " ----------- |\t\t\tINCORRECT INPUT\t\t\t\t| ----------- "
          );
          System.out.println(
            "------------------------------------------------------------------"
          );
        }
      } else {
        System.out.println(
          "------------------------------------------------------------------"
        );
        System.out.println("\t\t\t\t\t\t| 404 |\t\t\t");
        System.out.println("\t\t\t\tINCORRECT ID & PASSWORD\t\t\t");
        System.out.println(
          "------------------------------------------------------------------"
        );
        LOGININ(id, pw);
        System.exit(0);
      }
    } else {
      System.out.println(
        "------------------------------------------------------------------"
      );
      System.out.println("\t\t\t\t\t\t| 404 |\t\t\t");
      System.out.println("\t\t\t\tINCORRECT ID & PASSWORD\t\t\t");
      System.out.println(
        "------------------------------------------------------------------"
      );
      LOGININ(id, pw);
      System.exit(0);
    }
  }

  public static void CancellationSystem(
    String name,
    int age,
    String start,
    String end,
    int PNR,
    int Class_Type,
    String date,
    String train_name,
    int Train_Number
  ) {
    Scanner C = new Scanner(System.in);
    System.out.print("Enter PNR : ");
    int PNR_No = 0;
    try {
      PNR_No = C.nextInt();
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }
    if (PNR == PNR_No) {
      ticket(
        name,
        age,
        start,
        end,
        PNR,
        Class_Type,
        date,
        train_name,
        Train_Number
      );
      System.out.println(
        "-----------| CANCELLATION SUCCESSFULLY 👍 |----------- "
      );
      System.out.println(
        "------------------------------------------------------------------"
      );
    } else {
      System.out.println("-----------| PNR NOT FOUND 🤯 !!|-----------");
      CancellationSystem(
        name,
        age,
        start,
        end,
        PNR,
        Class_Type,
        date,
        train_name,
        Train_Number
      );
      System.out.println(
        "------------------------------------------------------------------"
      );
    }
  }

  public static void ReservationSystem() {
    String name = "";
    int age = 0;
    String start = "";
    String end = "";
    int Class_Type = 0;
    String date = "";
    String train_name = "";
    Scanner R = new Scanner(System.in);
    System.out.println(
      "------------------------------------------------------------------"
    );
    System.out.print("Enter Name of Passenger : ");
    try {
      name = R.nextLine();
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }
    System.out.print("Enter age : ");
    try {
      age = R.nextInt();
    } catch (Exception e) {
      System.out.println(e);
    }
    R.nextLine();
    System.out.print("Enter Train Name : ");
    try {
      train_name = R.nextLine();
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }
    System.out.print("Enter Destination Date : ");
    try {
      date = R.next();
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }
    System.out.print("Enter Class Type : ");
    try {
      Class_Type = R.nextInt();
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }
    System.out.print("Enter Destination : ");
    try {
      start = R.next();
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }
    System.out.print("To ");
    try {
      end = R.next();
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }
    System.out.println(
      "------------------------------------------------------------------"
    );
    int Train_Number = (int) (Math.random() * 1000000);
    int PNR = (int) (Math.random() * 10000);
    System.out.print("Press 1 To Generate Ticket : ");
    try {
      int BUTTON1 = R.nextInt();
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }
    if (BUTTON1 == 1) {
      ticket(
        name,
        age,
        start,
        end,
        PNR,
        Class_Type,
        date,
        train_name,
        Train_Number
      );
    } else {
      System.out.println(
        " ----------- |\t\t\tINCORRECT INPUT\t\t\t\t| ----------- "
      );
      System.out.println(
        "------------------------------------------------------------------"
      );
    }
    System.out.println(" ----------- | PRESS BUTTON | ----------- ");
    System.out.println(
      "------------------------------------------------------------------"
    );
    System.out.println("1.Ticket Conform\t\t\t2.Cancel Tickets");
    System.out.println(
      "------------------------------------------------------------------"
    );
    int button3 = R.nextInt();
    switch (button3) {
      case 1 -> {
        ticket(
          name,
          age,
          start,
          end,
          PNR,
          Class_Type,
          date,
          train_name,
          Train_Number
        );
        System.out.println(
          "-----------| YOUR TICKET IS CONFORM SUCCESSFULLY 😎 |-----------"
        );
        System.out.println(
          "--------------------------------------------------------------------------"
        );
      }
      case 2 -> {
        CancellationSystem(
          name,
          age,
          start,
          end,
          PNR,
          Class_Type,
          date,
          train_name,
          Train_Number
        );
      }
      default -> {
        System.out.println(
          " ----------- |\t\t\tINCORRECT INPUT\t\t\t\t| ----------- "
        );
        System.out.println(
          "------------------------------------------------------------------"
        );
      }
    }
  }

  public static void ticket(
    String name,
    int age,
    String start,
    String end,
    int PNR,
    int Class_Type,
    String date,
    String train_name,
    int Train_Number
  ) {
    Scanner T = new Scanner(System.in);
    System.out.println(
      "------------------------------------------------------------------"
    );
    System.out.println(" ----------- |\t\t\t\tTICKET\t\t\t\t| ----------- ");
    System.out.println(
      "--------------------------------------------------------------------------"
    );
    System.out.println("\t\t\t\t\t\t\t\t" + new Date());
    System.out.println("\t\t\t\t\t\t\t-----------------------------------");
    System.out.println(
      "|Train Name|\t\t\t|Train Number|\t\t\t|PNR|\t\t\t|Class_Type|"
    );
    System.out.println(
      train_name +
      "\t\t\t\t\t" +
      Train_Number +
      "\t\t\t\t" +
      PNR +
      "\t\t\t\t" +
      Class_Type
    );
    System.out.println("\nDestination - " + start + "\t\tTo\t\t" + end);
    System.out.println("\n|Passenger Name|\t\t\t|Age|\t\t\t|Date|");
    System.out.println(name + "\t\t\t\t\t" + age + "\t\t\t\t" + date);
    System.out.println(
      "--------------------------------------------------------------------------"
    );
  }

  public void Cancelticket(
    String name,
    int age,
    String start,
    String end,
    int PNR,
    int Class_Type,
    String date,
    String train_name,
    int Train_Number
  ) {
    Scanner CT = new Scanner(System.in);
    System.out.println("----------- | IF YOU CANCEL TICKET | -----------");
    System.out.println(
      "--------------------------------------------------------------------------"
    );
    System.out.print("PRESS BUTTON 1 : ");
    int BUTTON2 = CT.nextInt();
    if (BUTTON2 == 1) {
      CancellationSystem(
        name,
        age,
        start,
        end,
        PNR,
        Class_Type,
        date,
        train_name,
        Train_Number
      );
    } else {
      System.out.println(
        " ----------- |\t\t\tINCORRECT INPUT\t\t\t\t| ----------- "
      );
      System.out.println(
        "------------------------------------------------------------------"
      );
    }
  }
}