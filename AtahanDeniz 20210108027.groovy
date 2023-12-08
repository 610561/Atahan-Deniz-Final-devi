#include <stdio.h>

// Temel form yapısı
typedef struct {
    void (*goster)();
} Form;

// Proje Menü Formu
typedef struct {
    Form base;
    void (*dersKayitFormunuAc)();
    void (*ogrenciKayitFormunuAc)();
} ProjeMenuFormu;

void projeMenuGoster() {
    printf("Proje Menü Formu Görüntülendi\n");
}

void dersKayitFormunuAc() {
    printf("Ders Kayıt Formu Açıldı\n");
}

void ogrenciKayitFormunuAc() {
    printf("Öğrenci Kayıt Formu Açıldı\n");
}

int main() {
    ProjeMenuFormu projeMenu;
    projeMenu.base.goster = projeMenuGoster;
    projeMenu.dersKayitFormunuAc = dersKayitFormunuAc;
    projeMenu.ogrenciKayitFormunuAc = ogrenciKayitFormunuAc;

    // Proje Menü Formu'nu görüntüle
    projeMenu.base.goster();

    // Ders Kayıt Formu'nu aç
    projeMenu.dersKayitFormunuAc();

    // Öğrenci Kayıt Formu'nu aç
    projeMenu.ogrenciKayitFormunuAc();

    return 0;
}