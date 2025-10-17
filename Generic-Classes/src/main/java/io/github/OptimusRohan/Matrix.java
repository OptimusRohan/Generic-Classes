package io.github.OptimusRohan;

import java.util.List;

public class Matrix<T> {
    int numRows;
    int numCols;
    List<List<T>> data;
    public Matrix(int rows, int cols) {
        numRows = rows;
        numCols = cols;
    }

    void setElement(int row, int col, T value) {
        data.get(row).set(col, value);
    }

    T getElement(int row, int col) {
        return data.get(row).get(col);
    }

    Matrix<T> add(Matrix<T> other) {
        if (other.numRows != this.numRows || other.numCols != this.numCols) {
            throw new IllegalArgumentException("Matrix dimensions must match for addition.");
        }
        Matrix<T> result = new Matrix<>(this.numRows, this.numCols);
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {

                // Assuming T supports addition, which may require further constraints
                // This is a placeholder and would need actual implementation based on T
                // result.setElement(i, j, this.getElement(i, j) + other.getElement(i, j));
            }
        }
        return result;
    }
}
