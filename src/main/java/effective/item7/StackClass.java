package main.java.effective.item7;

import java.util.EmptyStackException;

public class StackClass {

    Object[] elements = new Object[10];
    int size = 10;

    // 다 쓴 참조를 해제하는 코드가 없다!
    public Object[] pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return (Object[]) elements[--size];
    }

    // 다 쓴 참조를 GC가 수거하도록 null 처리하여 메모리 누수를 방지
    public Object[] popNull() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        elements[size] = null;
        return (Object[]) elements[--size];
    }

    }
