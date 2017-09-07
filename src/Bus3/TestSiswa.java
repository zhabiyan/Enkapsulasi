/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus3;

/**
 *
 * @author Zhabiyan
 */
public class TestSiswa {
    public static void main(String args[]) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Zhabiyan Wahyu Setyaputra");
        siswa.setAbsen(38);
        siswa.setAddress("Jalan Danau Kerinci IV G6F No.22");
        
        System.out.println("Name : " + siswa.getName());
        System.out.println("Absen : " + siswa.getAbsen());
        System.out.println("Address : " + siswa.getAddress());
    }
}