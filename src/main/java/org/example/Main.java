package org.example;

//Matematikte ve özellike fonksiyonel analizde konvolüsyon ya da evrişim, bir fonksiyonun şeklinin başka fonksiyon tarafından nasıl modifiye
// edildiğini gösteren bir integral işlemdir. Konvolüsyon işlemi, sinyal işleme, mühendislik, olasılık, istatistik ve fizik gibi birçok
// farklı alanda sıklıkla kullanılmaktadır; bu işlem, sürekli ve ayrık zamandaki sinyallerin incelenmesinde kullanılmaktadır.
// Bu nedenle konvolüsyon özellikle doğrusal ve zamanla değişmeyen sistemlerin tepkilerinin analizinde önem arz etmektedir.
// İki sinyalin çarpımının frekans spektrumu konvolüsyon ile sinyallerin kendi frekans spektrumu ile ilişkilendirilebilir.

//Klavyedern birim dürtü ve giriş işareti girilen ayrık bir sistemin çıkışını hesaplayan program ( 1 boyutlu konvolsüyon işlemi )

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, i, j, k;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Giriş İşaretinin Uzunluğu : ");
        a = scanner.nextInt();
        double x[] = new double[a];
        System.out.print("Birim Dürtü Cevabının Uzunluğu : ");
        b = scanner.nextInt();
        double h[] = new double[b];
        double y[] = new double[a + b - 1];

        for (i = 0; i < a; i++) {
            System.out.print("x [" + (i + 1) + "] : ");
            x[i] = scanner.nextDouble();
        }

        for (i = 0; i < b; i++) {
            System.out.print("h [" + (i + 1) + "] : ");
            h[i] = scanner.nextDouble();
        }

        System.out.print("\nÇıkış İşareti : ");

        for (i = 0; i < a + b - 1; i++) {
            k = i;
            y[i] = 0;

            for (j = 0; j < b; j++) {
                if ((k >= 0) && (k < a)) y[i] += x[k] * h[j];
                k--;
            }

            System.out.printf("%.3f\t", y[i]);

        }

    }
}