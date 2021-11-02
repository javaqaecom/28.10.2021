public class money {
    //DATA
    public int value;


    //func
    public money(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "money{" +
                "value=" + value +
                '}';
    }
}
