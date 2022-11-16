package main.java.effective.item11;

import java.util.Objects;

public class HashCodeClass {
    private int hash;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCodeClass that = (HashCodeClass) o;
        return hash == that.hash;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash);
    }
}
