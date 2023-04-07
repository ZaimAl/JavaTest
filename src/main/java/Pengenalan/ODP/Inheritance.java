package Pengenalan.ODP;
class hewan {
    public void berkembangBiak (){
        System.out.println("Hewan berkembang biak");
    }
    public void makan (){
        System.out.println("Hewan makan");
    }
}
class burung extends hewan {
    public void terbang (){
        System.out.println("Burung terbang");
    }

    @Override
    public void makan() {
        System.out.println("Makan cacing");
    }
}
class ikan extends hewan {
    public void renang (){
        System.out.println("Ikan berenang");
    }

    @Override//polymorphism
    public void makan() {
        System.out.println("Makan alga");;
    }

    public static void main(String[] args) {
        burung Bangau = new burung();
        Bangau.makan();
        Bangau.terbang();
        Bangau.berkembangBiak();

        ikan Hiu = new ikan();
        Hiu.makan();
        Hiu.renang();
        Hiu.berkembangBiak();
    }
}
