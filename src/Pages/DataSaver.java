package Pages;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import UseCase.Barang.BarangPengepul.Ecobrick;
import UseCase.Barang.BarangProdusen.Produk;
import UseCase.Pengecek.PengecekEcoPay;
import UseCase.Pengecek.PengecekPengguna;
import UseCase.Pengecek.PengecekProduk;
import UseCase.Pengecek.PengecekTransaksi;
import UseCase.Pengguna.Pengguna;
import UseCase.PoinEcoPay.EcoPay;
import UseCase.Transaksi.Transaksi;

import java.io.*;

import java.util.ArrayList;

public class DataSaver {
    
    private XStream xstream = new XStream(new StaxDriver());

    public DataSaver() {
        xstream = new XStream(new StaxDriver());
        // Konfigurasi tambahan jika diperlukan

        // Tambahkan izin untuk kelas-kelas yang diizinkan
        xstream.addPermission(AnyTypePermission.ANY);
       
        xstream.allowTypesByWildcard(new String[] {
            "UseCase.Pengguna.Pengguna",
            "java.util.ArrayList",
            "java.util.LinkedList",
            "java.util.Vector"
        });
    }

    //method to save text data to XML file
    public void saveText(Object a, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            xstream.toXML(a, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //method to load text data from XML file
    public <T> T loadText(String fileName, Class<T> type) {
        T data = null;
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File does not exist");
        } else if (!file.canRead()) {
            System.out.println("File exists but cannot be read");
        } else {
            System.out.println("File exists and can be read");
            try {
                FileReader reader = new FileReader(fileName);
                data = (T) xstream.fromXML(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    //method to save binary data to XML file
    public void saveBinaryData(byte[] data, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.write(data);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //method to save binary data to XML file
    public byte[] loadBinaryData(String fileName) {
        File file = new File(fileName);
        byte[] data = null;
        if (file.exists() && file.canRead()) {
            try {
                FileInputStream fis = new FileInputStream(fileName);
                data = new byte[(int) file.length()];
                fis.read(data);
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    // method to save Data Pengguna
    public void saveDataPengguna(ArrayList<Pengguna> arr, String name){

       // larik double diubah menjadi string dengan format XML
       String xml = xstream.toXML(arr);

       FileOutputStream coba = null;
       try {
           //membuat nama file & folder tempat menyimpan jika perlu
           coba = new FileOutputStream(name);

           // mengubah karakter penyusun string xml sebagai 
           // bytes (berbentuk nomor2 kode ASCII
           byte[] bytes = xml.getBytes("UTF-8");

           // menyimpan file dari bytes
           coba.write(bytes);
       } 
       
       catch (Exception e) {
           System.err.println("Perhatian: " + e.getMessage());
       } 
       
       finally {
           if (coba != null) {
               try {
                   coba.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
   }

    // method to load Data Pengguna
    public ArrayList<Pengguna> loadDataPengguna(String name){
        
        StringBuilder xmlBuilder = new StringBuilder();
    
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                xmlBuilder.append(line);
                }
        } catch (IOException e) {
            System.err.println("Gagal membaca file XML: " + e.getMessage());
        }
        
        String xml = xmlBuilder.toString();
        ArrayList<Pengguna> arr = (ArrayList<Pengguna>) xstream.fromXML(xml);
        return arr;
            
    }

    // method to save Data EcoPay
    public void saveDataEcoPay(ArrayList<EcoPay> arr, String name){

       // larik double diubah menjadi string dengan format XML
       String xml = xstream.toXML(arr);

       FileOutputStream coba = null;
       try {
           //membuat nama file & folder tempat menyimpan jika perlu
           coba = new FileOutputStream(name);

           // mengubah karakter penyusun string xml sebagai 
           // bytes (berbentuk nomor2 kode ASCII
           byte[] bytes = xml.getBytes("UTF-8");

           // menyimpan file dari bytes
           coba.write(bytes);
       } 
       
       catch (Exception e) {
           System.err.println("Perhatian: " + e.getMessage());
       } 
       
       finally {
           if (coba != null) {
               try {
                   coba.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
   }

    // method to load Data EcoPay
    public ArrayList<EcoPay> loadDataEcoPay(String name){
        
        StringBuilder xmlBuilder = new StringBuilder();
    
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                xmlBuilder.append(line);
                }
        } catch (IOException e) {
            System.err.println("Gagal membaca file XML: " + e.getMessage());
        }
        
        String xml = xmlBuilder.toString();
        ArrayList<EcoPay> arr = (ArrayList<EcoPay>) xstream.fromXML(xml);
        return arr;
            
    }

    // method to save Data Produk
    public void saveDataProduk(ArrayList<Produk> arr, String name){

       // larik double diubah menjadi string dengan format XML
       String xml = xstream.toXML(arr);

       FileOutputStream coba = null;
       try {
           //membuat nama file & folder tempat menyimpan jika perlu
           coba = new FileOutputStream(name);

           // mengubah karakter penyusun string xml sebagai 
           // bytes (berbentuk nomor2 kode ASCII
           byte[] bytes = xml.getBytes("UTF-8");

           // menyimpan file dari bytes
           coba.write(bytes);
       } 
       
       catch (Exception e) {
           System.err.println("Perhatian: " + e.getMessage());
       } 
       
       finally {
           if (coba != null) {
               try {
                   coba.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
   }

    // method to load Data Produk
    public ArrayList<Produk> loadDataProduk(String name){
        
        StringBuilder xmlBuilder = new StringBuilder();
    
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                xmlBuilder.append(line);
                }
        } catch (IOException e) {
            System.err.println("Gagal membaca file XML: " + e.getMessage());
        }
        
        String xml = xmlBuilder.toString();
        ArrayList<Produk> arr = (ArrayList<Produk>) xstream.fromXML(xml);
        return arr;
            
    }

    // method to save Data Ecobrick
    public void saveDataEcobrick(ArrayList<Ecobrick> arr, String name){

       // larik double diubah menjadi string dengan format XML
       String xml = xstream.toXML(arr);

       FileOutputStream coba = null;
       try {
           //membuat nama file & folder tempat menyimpan jika perlu
           coba = new FileOutputStream(name);

           // mengubah karakter penyusun string xml sebagai 
           // bytes (berbentuk nomor2 kode ASCII
           byte[] bytes = xml.getBytes("UTF-8");

           // menyimpan file dari bytes
           coba.write(bytes);
       } 
       
       catch (Exception e) {
           System.err.println("Perhatian: " + e.getMessage());
       } 
       
       finally {
           if (coba != null) {
               try {
                   coba.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
   }

    // method to load Data Ecobrick
    public ArrayList<Ecobrick> loadDataEcobrick(String name){
        
        StringBuilder xmlBuilder = new StringBuilder();
    
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                xmlBuilder.append(line);
                }
        } catch (IOException e) {
            System.err.println("Gagal membaca file XML: " + e.getMessage());
        }
        
        String xml = xmlBuilder.toString();
        ArrayList<Ecobrick> arr = (ArrayList<Ecobrick>) xstream.fromXML(xml);
        return arr;
            
    }

    // method to save Data Transaksi
    public void saveDataTransaksi(ArrayList<Transaksi> arr, String name){

       // larik double diubah menjadi string dengan format XML
       String xml = xstream.toXML(arr);

       FileOutputStream coba = null;
       try {
           //membuat nama file & folder tempat menyimpan jika perlu
           coba = new FileOutputStream(name);

           // mengubah karakter penyusun string xml sebagai 
           // bytes (berbentuk nomor2 kode ASCII
           byte[] bytes = xml.getBytes("UTF-8");

           // menyimpan file dari bytes
           coba.write(bytes);
       } 
       
       catch (Exception e) {
           System.err.println("Perhatian: " + e.getMessage());
       } 
       
       finally {
           if (coba != null) {
               try {
                   coba.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
   }

    // method to load Data Transaksi
    public ArrayList<Transaksi> loadDataTransaksi(String name){
        
        StringBuilder xmlBuilder = new StringBuilder();
    
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                xmlBuilder.append(line);
                }
        } catch (IOException e) {
            System.err.println("Gagal membaca file XML: " + e.getMessage());
        }
        
        String xml = xmlBuilder.toString();
        ArrayList<Transaksi> arr = (ArrayList<Transaksi>) xstream.fromXML(xml);
        return arr;
            
    }

    // method to save Data PengecekPengguna
    public void saveDataPengecekPengguna(ArrayList<PengecekPengguna> arr, String name){

       // larik double diubah menjadi string dengan format XML
       String xml = xstream.toXML(arr);

       FileOutputStream coba = null;
       try {
           //membuat nama file & folder tempat menyimpan jika perlu
           coba = new FileOutputStream(name);

           // mengubah karakter penyusun string xml sebagai 
           // bytes (berbentuk nomor2 kode ASCII
           byte[] bytes = xml.getBytes("UTF-8");

           // menyimpan file dari bytes
           coba.write(bytes);
       } 
       
       catch (Exception e) {
           System.err.println("Perhatian: " + e.getMessage());
       } 
       
       finally {
           if (coba != null) {
               try {
                   coba.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
   }

    // method to load Data PengecekPengguna
    public ArrayList<PengecekPengguna> loadDataPengecekPengguna(String name){
        
        StringBuilder xmlBuilder = new StringBuilder();
    
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                xmlBuilder.append(line);
                }
        } catch (IOException e) {
            System.err.println("Gagal membaca file XML: " + e.getMessage());
        }
        
        String xml = xmlBuilder.toString();
        ArrayList<PengecekPengguna> arr = (ArrayList<PengecekPengguna>) xstream.fromXML(xml);
        return arr;
            
    }
    
    // method to save Data PengecekEcoPay
    public void saveDataPengecekEcoPay(ArrayList<PengecekEcoPay> arr, String name){

       // larik double diubah menjadi string dengan format XML
       String xml = xstream.toXML(arr);

       FileOutputStream coba = null;
       try {
           //membuat nama file & folder tempat menyimpan jika perlu
           coba = new FileOutputStream(name);

           // mengubah karakter penyusun string xml sebagai 
           // bytes (berbentuk nomor2 kode ASCII
           byte[] bytes = xml.getBytes("UTF-8");

           // menyimpan file dari bytes
           coba.write(bytes);
       } 
       
       catch (Exception e) {
           System.err.println("Perhatian: " + e.getMessage());
       } 
       
       finally {
           if (coba != null) {
               try {
                   coba.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
   }

    // method to load Data PengecekEcoPay
    public ArrayList<PengecekEcoPay> loadDataPengecekEcoPay(String name){
        
        StringBuilder xmlBuilder = new StringBuilder();
    
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                xmlBuilder.append(line);
                }
        } catch (IOException e) {
            System.err.println("Gagal membaca file XML: " + e.getMessage());
        }
        
        String xml = xmlBuilder.toString();
        ArrayList<PengecekEcoPay> arr = (ArrayList<PengecekEcoPay>) xstream.fromXML(xml);
        return arr;
            
    }

    // method to save Data PengecekProduk
    public void saveDataPengecekProduk(ArrayList<PengecekProduk> arr, String name){

       // larik double diubah menjadi string dengan format XML
       String xml = xstream.toXML(arr);

       FileOutputStream coba = null;
       try {
           //membuat nama file & folder tempat menyimpan jika perlu
           coba = new FileOutputStream(name);

           // mengubah karakter penyusun string xml sebagai 
           // bytes (berbentuk nomor2 kode ASCII
           byte[] bytes = xml.getBytes("UTF-8");

           // menyimpan file dari bytes
           coba.write(bytes);
       } 
       
       catch (Exception e) {
           System.err.println("Perhatian: " + e.getMessage());
       } 
       
       finally {
           if (coba != null) {
               try {
                   coba.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
   }

    // method to load Data PengecekProduk
    public ArrayList<PengecekProduk> loadDataPengecekProduk(String name){
        
        StringBuilder xmlBuilder = new StringBuilder();
    
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                xmlBuilder.append(line);
                }
        } catch (IOException e) {
            System.err.println("Gagal membaca file XML: " + e.getMessage());
        }
        
        String xml = xmlBuilder.toString();
        ArrayList<PengecekProduk> arr = (ArrayList<PengecekProduk>) xstream.fromXML(xml);
        return arr;
            
    }

    // method to save Data PengecekTransaksi
    public void saveDataPengecekTransaksi(ArrayList<PengecekTransaksi> arr, String name){

       // larik double diubah menjadi string dengan format XML
       String xml = xstream.toXML(arr);

       FileOutputStream coba = null;
       try {
           //membuat nama file & folder tempat menyimpan jika perlu
           coba = new FileOutputStream(name);

           // mengubah karakter penyusun string xml sebagai 
           // bytes (berbentuk nomor2 kode ASCII
           byte[] bytes = xml.getBytes("UTF-8");

           // menyimpan file dari bytes
           coba.write(bytes);
       } 
       
       catch (Exception e) {
           System.err.println("Perhatian: " + e.getMessage());
       } 
       
       finally {
           if (coba != null) {
               try {
                   coba.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
   }

    // method to load Data PengecekTransaksi
    public ArrayList<PengecekTransaksi> loadDataPengecekTransaksi(String name){
        
        StringBuilder xmlBuilder = new StringBuilder();
    
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                xmlBuilder.append(line);
                }
        } catch (IOException e) {
            System.err.println("Gagal membaca file XML: " + e.getMessage());
        }
        
        String xml = xmlBuilder.toString();
        ArrayList<PengecekTransaksi> arr = (ArrayList<PengecekTransaksi>) xstream.fromXML(xml);
        return arr;
            
    }
}
