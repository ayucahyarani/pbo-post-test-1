package com.mycompany.posttest1;
import java.util.ArrayList; 

public class Posttest1 {

    public static void main(String[] args) { 
        ArrayList<Lagu> laguList = new ArrayList<>();

        laguList.add(new Lagu("Shape of You", "Ed Sheeran", 2017)); 
        laguList.add(new Lagu("Bohemian Rhapsody", "Queen", 1975)); 
        laguList.add(new Lagu("Billie Jean", "Michael Jackson", 1983)); 
        laguList.add(new Lagu("Imagine", "John Lennon", 1971)); 
        laguList.add(new Lagu("Rolling in the Deep", "Adele", 2010)); 

        for (Lagu lagu : laguList) { 
            System.out.println("Judul lagu: " + lagu.judul + 
                               ", Penyanyi: " + lagu.penyanyi + 
                               ", Tahun Rilis: " + lagu.tahunRilis); 
        }
    }
}
