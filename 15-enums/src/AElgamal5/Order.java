package AElgamal5;

public class Order {
    private OrderStatus status = OrderStatus.PENDING;

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public boolean canCancel() {
        return this.getStatus() == OrderStatus.PENDING || this.getStatus() == OrderStatus.PROCESSING;
    }

}