package AElgamal5;

public enum Numbers {
    ONE {
        @Override
        void print() {
            System.out.println("print method form one");
        }
    },
    TWO {
        @Override
        void print() {
            System.out.println("print method form two");
        }
    };

    abstract void print();
}
