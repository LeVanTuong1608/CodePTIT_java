/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */
import java.lang.Math.*;
import java.math.*;

import java.util.*;
class Point{
    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
        
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.x,2)+ Math.pow(this.y - p.y,2));
    }
    double distance(Point a,Point b){
        return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y + b.y,2));
    }
    @Override
    public String toString() {
        return x +" "+ y;
       // return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
public class j04001_KhaiBaoLopPOINT {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-->0){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point a = new Point(x,y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point b = new Point(x,y);
            System.out.printf("%.4f\n",a.distance(b));
        }
    }
}
