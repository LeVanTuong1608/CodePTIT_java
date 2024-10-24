/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */import java.io.*;
public class bt {
    

//public class CreateBinaryFileByte {
    public static void main(String[] args) {
        // Tạo một mảng byte dữ liệu
        byte[] data = {10, 20, 30, 40, 50};

        // Ghi mảng byte vào tệp nhị phân
        try (FileOutputStream fos = new FileOutputStream("SONGUYEN1.in")) {
            fos.write(data);  // Ghi mảng byte vào tệp
            System.out.println("Đã tạo tệp nhị phân dạng byte thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

