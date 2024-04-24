package org.uber.excption;

public class ArrayOutOfBound extends Throwable {
    public ArrayOutOfBound(ArrayIndexOutOfBoundsException e) {
        this.exception();
    }

    public void exception() {
//        System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage())
    }
}
