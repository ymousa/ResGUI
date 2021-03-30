package com.company;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Reservierungen extends Datenbank{
    public static Scanner scan;
    private static String[] data={"Nr.","Reservierer","Raum","Datum",
                                "Veranstalltung","Uhrzeit","Dauer","Notizen" };


    public static void resNummerieren()throws IOException{
        BufferedReader brRes = new BufferedReader(new FileReader(reservierungen));
        BufferedReader brBe = new BufferedReader(new FileReader(resBearbeitung));

        BufferedWriter bwBe= new BufferedWriter(new FileWriter(resBearbeitung));
        String line = null;
        while((line = brRes.readLine()) != null ){      //data von reservierungen.txt wieder in resBearbeitung.txt
            bwBe.write(line + System.getProperty("line.separator"));
        }
        bwBe.close();
        brRes.close();

        BufferedWriter bwRes= new BufferedWriter(new FileWriter(reservierungen));  //Data von res nummerieren
        line = null;
        String[] dataRes;
        int i=1;
        while ((line = brBe.readLine()) != null){
            dataRes = line.split(";");
            dataRes[0]= String.valueOf(i);
            writeRes(bwRes, dataRes);
            i++;
        }
        bwRes.flush();
        bwRes.close();
    }

    public static void writeRes(BufferedWriter bw, String[] data){
        try { // bw.flush und bw.close nicht vergessen
            bw.write(data[0]);
            bw.write(";");
            bw.write(data[1]);
            bw.write(";");
            bw.write(data[2]);
            bw.write(";");
            bw.write(data[3]);
            bw.write(";");
            bw.write(data[4]);
            bw.write(";");
            bw.write(data[5]);
            bw.write(";");
            bw.write(data[6]);
            bw.write(";");
            bw.write(data[7]);
            bw.write(System.getProperty("line.separator"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printRes(String[] data){
        System.out.print(data[0] + ". ");
        System.out.print(data[1]);
        System.out.print(":\tRaum: " + data[2]);
        System.out.print(",\tDatum: " + data[3]);
        System.out.print(",\tVeranstaltung: " + data[4]);
        System.out.print(",\tUhrzeit: " + data[5]);
        System.out.print(",\tDauer: " + data[6]);
        System.out.print(",\tNotizen: " + data[7]);
        System.out.println();
    }

    public static void showRes(String gesReservierer) throws IOException {
        BufferedReader brfTXT = null;
        brfTXT = new BufferedReader(new FileReader(reservierungen));
        String line;
        String[] resData= null;

        while((line = brfTXT.readLine()) != null){
            resData = line.split(";");
            if(gesReservierer == null){
                printRes(resData);
            } else if(gesReservierer.trim().equals(resData[1].trim())) {
                printRes(resData);
            }
        }
        brfTXT.close();

    }

    public void neuReservieren(String reserviererName) throws IOException {
        Random rn = new Random();
        int random= rn.nextInt(100);

        data[0]= String.valueOf(random);
        data[1]= reserviererName;
        System.out.print("Raum: ");
        data[2] = brf.readLine();
        System.out.print("Datum(tt.mm.jjjj): ");
        data[3]= brf.readLine();
        System.out.print("Veranstaltung: ");
        data[4] = brf.readLine();
        System.out.print("Uhrzeit(hh:mm): ");
        data[5] = brf.readLine();
        System.out.print("Dauer(in Stunden): ");
        data[6] = brf.readLine();
        System.out.print("Notizen: ");
        data[7] = brf.readLine();
        BufferedWriter bwRes= new BufferedWriter(new FileWriter(reservierungen, true));
        writeRes(bwRes, data);
        bwRes.flush();
        bwRes.close();
    }

    public static void deleteRes(String gesReservierer) throws IOException {
        showRes(gesReservierer);
        System.out.print("ReservierungsNUMMER: ");
        int resNummer= ControllerMenu.inputInt();
        BufferedReader brRes = new BufferedReader(new FileReader(reservierungen));
        BufferedReader brBe = new BufferedReader(new FileReader(resBearbeitung));

        BufferedWriter bwBe= new BufferedWriter(new FileWriter(resBearbeitung));
        String line=null;
        while((line = brRes.readLine()) != null ){      //überspringe LINE was mit der Nummer .... anfängt
            String trimmedLine = line.trim();
            if(trimmedLine.startsWith(String.valueOf(resNummer))) {
                continue;
            }
            bwBe.write(line + System.getProperty("line.separator"));
        }
        bwBe.close();
        brRes.close();
        BufferedWriter bwRes= new BufferedWriter(new FileWriter(reservierungen)); //Data nach delete und nummerieren in res schreiben
        line= null;
        String[] dataRes;
        int i=1;
        while ((line = brBe.readLine()) != null){
            dataRes = line.split(";");
            dataRes[0]= String.valueOf(i);
            writeRes(bwRes, dataRes);
            i++;
        }
        bwRes.flush();
        bwRes.close();

    }


}
