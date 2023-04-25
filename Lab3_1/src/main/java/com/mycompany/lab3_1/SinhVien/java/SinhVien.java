/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3_1.SinhVien.java;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class SinhVien {

    private long maSV;
    private String tenSV;
    private double diem;

    public SinhVien(long maSV, String tenSV, double diem) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diem = diem;
    }

    public SinhVien() {
    }

    public long getMaSV() throws NumberFormatException {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public double getDiem() {
        return diem;
    }

    public void setMaSV(long maSV) {
        this.maSV = maSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", diem=" + diem + '}';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SinhVien sv1 = new SinhVien();
        System.out.println("Nhap Ma sinh vien");
        sv1.maSV = in.nextLong();
        System.out.println("Nhap Ten sinh vien");
        sv1.tenSV = in.nextLine();
        System.out.println("Nhap Diem sv");
        sv1.diem = in.nextDouble();
    }

}

