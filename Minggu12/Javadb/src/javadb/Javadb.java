/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadb;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author D2A
 */
public class Javadb {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/penjualan";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
        System.out.println("Menu:");
        System.out.println("1. Insert data");
        System.out.println("2. Hapus data");
        System.out.println("3. Update data");
        System.out.println("4. Tampilkan data");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
        choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                insert();
                break;
            case 2:
                hapusData();
                break;
            case 3:
                updateData();
                break;
            case 4:
                show();
                break;
            case 0:
                System.out.println("Keluar dari program");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        
        System.out.println();
    } while (choice != 0);
}
    
    public static void connect(){
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public static void insert()
	{
		Scanner s = new Scanner(System.in);
                System.out.print("Masukkan kode barrang : ");
                String kode_brg = s.nextLine();
                System.out.print("Masukkan nama barrang : ");
                String nama_brg = s.nextLine();
                System.out.print("Masukkan Satuan : ");
                String satuan = s.nextLine();
                System.out.print("Masukkan stok barrang : ");
                int stok = s.nextInt();
                System.out.print("Masukkan stok minimal barrang : ");
                int stok_min = s.nextInt();
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();
			
			String sql = "INSERT INTO barang (kd_brg,nm_brg,satuan,stok_brg,stok_min) VALUES (?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, kode_brg);
			ps.setString(2, nama_brg);
			ps.setString(3, satuan);
			ps.setInt(4, stok);
			ps.setInt(5, stok_min);
			
			ps.execute();
			
			stmt.close();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void show()
	{
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM barang");
			int i = 1;
			while(rs.next())
			{
				System.out.println("Data ke-"+i);
				System.out.println("Kode Barang: " + rs.getString("kd_brg"));
				System.out.println("Nama Barang: "+rs.getString("nm_brg"));
				System.out.println("Satuan: "+rs.getString("satuan"));
				System.out.println("Stok: "+rs.getString("stok_brg"));
				System.out.println("Stok minimal: "+rs.getString("stok_min"));
				i++;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
        public static void hapusData()
{
    Scanner s = new Scanner(System.in);
    System.out.print("Masukkan ID data yang akan dihapus: ");
    int id = s.nextInt();
    
    try {
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();
        
        String sql = "DELETE FROM barang WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        
        int rowsDeleted = ps.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Data berhasil dihapus");
        } else {
            System.out.println("Data tidak ditemukan");
        }
        
        stmt.close();
        conn.close();
    }
    catch(Exception e) {
        e.printStackTrace();
    }
}

public static void updateData()
{
    Scanner s = new Scanner(System.in);
    System.out.print("Masukkan ID data yang akan diupdate: ");
    int id = s.nextInt();
    s.nextLine();
    
    System.out.print("Masukkan kode barang baru: ");
    String kode_brg = s.nextLine();
    System.out.print("Masukkan nama barang baru: ");
    String nama_brg = s.nextLine();
    System.out.print("Masukkan satuan baru: ");
    String satuan = s.nextLine();
    System.out.print("Masukkan stok barang baru: ");
    int stok = s.nextInt();
    System.out.print("Masukkan stok minimal barang baru: ");
    int stok_min = s.nextInt();
    
    try {
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();
        
        String sql = "UPDATE barang SET kd_brg=?, nm_brg=?, satuan=?, stok_brg=?, stok_min=? WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ps.setString(1, kode_brg);
        ps.setString(2, nama_brg);
        ps.setString(3, satuan);
        ps.setInt(4, stok);
        ps.setInt(5, stok_min);
        ps.setInt(6, id);
        
        int rowsUpdated = ps.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Data berhasil diupdate");
        } else {
            System.out.println("Data tidak ditemukan");
        }
        
        stmt.close();
        conn.close();
    }
    catch(Exception e) {
        e.printStackTrace();
    }
}
}
