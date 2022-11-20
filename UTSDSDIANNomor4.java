/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts.ds.dian.no4;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author dian nurdiani
 */
public class UTSDSDIANNo4 {

   
     public class Main {
    public static void main(String[] args) {
        LinkedList<Mahasiswa> mahasiswaList = new LinkedList<>();
        mahasiswaList.add(new Mahasiswa(2255201, "Fazry Febrian", "TIFRM22B", 181122));
        mahasiswaList.add(new Mahasiswa(2255202, "Reppy As Siddiq", "TIFRM22A", 181122));
        mahasiswaList.add(new Mahasiswa(2255203, "Moch Fikry Deniansyah", "TIFK22C", 181122));
        mahasiswaList.add(new Mahasiswa(2255204, "Safira Nur Rizqa Martalegawa", "TIFK22C", 181122));
        mahasiswaList.add(new Mahasiswa(2255205, "Fidya Nanda Meysa", "TIFRM22B", 181122));

        Scanner valueId = new Scanner(System.in);
        Scanner valueName = new Scanner(System.in);
        Scanner valueKelas = new Scanner(System.in);
        Scanner valueTanggal = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        System.out.println("Masukan Data Mahasiswa Untuk Ditambahkan");
         System.out.print("Masukan Id Mahasiswa : ");
        int id = valueId.nextInt();
        System.out.print("Masukan Nama Mahasiswa : ");
        String name = valueName.nextLine();
        System.out.print("Masukan Kelas Mahasiswa : ");
        String kelas = valueKelas.nextLine();
        System.out.print("Masukan Tanggal : ");
        int tanggal = valueTanggal.nextInt();

        mahasiswaList.add(new Mahasiswa(id, name, kelas, tanggal));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));

        System.out.println("Masukan Data Mahasiswa Untuk Dihapus");
        System.out.print("Masukan Nama Mahasiswa : ");
        String nameRemove = value.nextLine();
        /*        mahasiswaList.removeIf(mahasiswa -> mahasiswa.getName().contains(nameRemove));
        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));*/
        /*}*/
    
    /*}*/
        
