package io.github.OptimusRohan;

public class ModularArithmetic implements IRingElement<ModularArithmetic> {
    private final int value;
    private final int modulus;

    public ModularArithmetic(int value, int modulus) {
        if (modulus <= 0) {
            throw new IllegalArgumentException("Modulus must be a positive integer.");
        }
        if (value < 0) {
            throw new IllegalArgumentException("Value must be a non-negative integer.");
        }
        this.value = value % modulus; // ensure non-negative
        this.modulus = modulus;
    }

    @Override
    public ModularArithmetic add(ModularArithmetic other) {
        if (this.modulus != other.modulus) {
            throw new IllegalArgumentException("Moduli must be the same for addition.");
        }
        return new ModularArithmetic(this.value + other.value, this.modulus);
    }

    @Override
    public ModularArithmetic multiply(ModularArithmetic other) {
        if (this.modulus != other.modulus) {
            throw new IllegalArgumentException("Moduli must be the same for multiplication.");
        }
        return new ModularArithmetic(this.value * other.value, this.modulus);
    }

    @Override
    public String toString() {
        return String.format("The value is %d (mod%d)", value, modulus);
    }

    public int getValue() {
        return value;
    }

    public int getModulus() {
        return modulus;
    }

}
