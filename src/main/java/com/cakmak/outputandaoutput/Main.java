package com.cakmak.outputandaoutput;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("dosya.txt");
            fos.write(65);
        }
        catch (FileNotFoundException e){
            System.out.println("dosya bulunamadı!!!!");
        }
        catch (IOException e){
            System.out.println("dosyaya yazılırken hata oluştu");
        }
        finally {
            try {
                fos.close();
            }
            catch (IOException e) {
                System.out.println("dosya kapatılırken hata oluştu!!!!!");
            }
        }
    }
}
