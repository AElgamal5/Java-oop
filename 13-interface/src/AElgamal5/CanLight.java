package AElgamal5;

public interface CanLight {

    public void light();

    public interface CanLightFront {
        public void frontLight();
    }

    public interface CanLightBack {
        public void backLight();
    }
}
