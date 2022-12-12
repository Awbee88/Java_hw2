package sem6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Laptop {
    private String brandName;
    private String os;
    private String color;
    private Integer hdSize;
    private Integer ramSize;

    public Laptop(String brandName, String os, String color, Integer hdSize, Integer ramSize) {
        this.brandName = brandName;
        this.os = os;
        this.color = color;
        this.hdSize = hdSize;
        this.ramSize = ramSize;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Laptop [brandName=" + brandName + ", os=" + os + ", color=" + color + ", hdSize=" + hdSize
                + ", ramSize=" + ramSize + "]";
    }

    public String getBrandName() {
        return brandName;
    }

    public String getOs() {
        return os;
    }

    public Integer getHdSize() {
        return hdSize;
    }

    public Integer getRamSize() {
        return ramSize;
    }

}
