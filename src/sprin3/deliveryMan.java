
package sprin3;

public class deliveryMan {
   String name;
   String status;

    public deliveryMan(String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "deliveryMan{" + "Name=" + name + ", status=" + status + '}';
    }

    public deliveryMan() {
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
