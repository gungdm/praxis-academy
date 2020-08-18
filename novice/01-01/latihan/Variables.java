public class Variables {
    //Tipe-tipe variabel
    //1. Local Variable
    //2. Instances Variable
    //3. Class/Static Variable
    public String name;

    private int variabel;

    //contoh localVariable
    public void localVariable() {
        int variabel;
        variabel = 11;
        System.out.println("contoh local variabel = " + variabel);
    }

    //contoh instancesVariable
    public void instancesVariable(final String name) {
        this.name = name;

    }

    public void setVariabel(final int variabel) {
        this.variabel = variabel;
    }

    public void printInstancesVariable() {
        System.out.println("Nama InstancesVariable adalah : " + name);
        System.out.println("Contoh nama InstancesVariable adalah : " + variabel);
    }

    public static void main(final String[] args) {
        // Contoh variabel
        final int variabel = 10;
        System.out.println(variabel);

        // localVariable
        final Variables contohLocalVariabel = new Variables();
        contohLocalVariabel.localVariable();

        // instancesVariable
        final Variables contohInstancesVariable = new Variables();
        contohInstancesVariable.instancesVariable("testing");
        contohInstancesVariable.setVariabel(12);
        contohInstancesVariable.printInstancesVariable();

        // class-staticVariable
        final Variables contohClass_staticVariable = new Variables();
        contohClass_staticVariable.variabel = 100;


        //default null/0
        //harus menggunakan inheritance
        System.out.println("mengakses variabel local: " + contohClass_staticVariable.variabel);

       // contohClass_staticVariable.Check --->>> eror karena static

    }
}

// contoh Class-static Variable
class ClassStaticVariable {
    private int variabel = 50;

    public static final String Check = "Class Static Variabel adalah : ";

    public void privateVariabel() {
        variabel = 75;
    }
}