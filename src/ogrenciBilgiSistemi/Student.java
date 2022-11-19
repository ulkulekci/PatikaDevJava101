package ogrenciBilgiSistemi;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    Course ksnot;
    Course fsnot;
    Course msnot;



    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya,Course ksnot,Course fsnot,Course msnot) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.fsnot = fsnot;
        this.ksnot = ksnot;
        this.msnot = msnot;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int fsnot, int ksnot, int msnot ) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (fsnot >= 0 && fsnot <= 100) {
            this.fsnot.varbelNote = fsnot;
        }
        if (ksnot >= 0 && ksnot <= 100) {
            this.ksnot.varbelNote = ksnot;
        }
        if (msnot >= 0 && msnot <= 100) {
            this.msnot.varbelNote = msnot;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0|| this.msnot.varbelNote==0||this.ksnot.varbelNote==0||this.fsnot.varbelNote==0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note*0.80+ this.fsnot.varbelNote*0.20) +(this.kimya.note*0.80+this.ksnot.varbelNote*0.20) + (this.mat.note*0.80+this.msnot.varbelNote*0.20)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.msnot.varbelNote);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fsnot.varbelNote);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.ksnot.varbelNote);
    }

}