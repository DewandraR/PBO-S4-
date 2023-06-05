import java.util.ArrayList;

public class Cellphone implements Phone {
  String merk;
  String type;
  int batteryLevel;
  int status;
  int volume;
  int balance;
  ArrayList<Contact> contacts;

  public Cellphone(String merk, String type) {
    this.merk = merk;
    this.type = type;
    this.batteryLevel = (int) (Math.random() * (100 - 0 + 1) + 0);
    this.balance = 0;
    this.contacts = new ArrayList<Contact>();
    this.volume = 50;
  }

  public void powerOn() {
    this.status = 1;
    System.out.println("Ponsel menyala");
  }

  public void powerOff() {
    this.status = 0;
    System.out.println("Ponsel mati");
  }

  public void showVolume() {
    if (this.volume % 25 == 0) {
      System.out.println("Volume sekarang: " + this.volume);
    }
  }

  public void volumeUp() {
    if (this.status == 0) {
      System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
    } else {
      this.volume += 25;
      if (this.volume > 100) {
        this.volume = 100;
      }
      showVolume();
    }
  }

  public void volumeDown() {
    if (this.status == 0) {
      System.out.println("Ponsel mati. Tidak dapat menurunkan volume");
    } else {
      this.volume -= 25; 
      if (this.volume < 0) {
        this.volume = 0;
      }
      showVolume();
    }

  }

  public int getVolume() {
    return this.volume;
  }

  public void topUp(int amount) {
    if (this.status == 0) {
      System.out.println("Ponsel mati. Tidak dapat melakukan top up");
    } else {
      this.balance += amount;
      System.out.println("Top up berhasil. Sisa pulsa: " + this.balance);
    }
  }

  public int getBalance() {
    if (this.status == 0) {
      System.out.println("Ponsel mati. Tidak dapat melihat sisa pulsa");
      return -1;
    } else {
      return this.balance;
    }
  }

  public void addContact(String nama, String nomor) {
    if (this.status == 0) {
      System.out.println("Ponsel mati. Tidak dapat menambahkan kontak");
    } else {
      Contact c = new Contact(nama, nomor);
      this.contacts.add(c);
      System.out.println("Kontak berhasil ditambahkan");
    }
  }

  public void viewContacts() {
    if (this.status == 0) {
      System.out.println("Ponsel mati. Tidak dapat melihat kontak");
    } else {
      System.out.println("Daftar kontak:");
      for (Contact c : this.contacts) {
        System.out.println(c.getNama() + " - " + c.getNomor());
      }
    }
  }

  public Contact findContact(String nama) {
    if (this.status == 0) {
      System.out.println("Ponsel mati. Tidak dapat mencari kontak");
      return null;
    } else {
      for (Contact c : this.contacts) {
        if (c.getNama().equals(nama)) {
          return c;
        }
      }
      return null;
    }
  }
}
