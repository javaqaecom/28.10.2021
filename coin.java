public class coin extends money{
    //value
    public int size;

    public coin(int value) {
        super(value);
        this.size = value*2;
    }

    @Override
    public String toString() {
        return "coin{" +
                "size=" + size +
                ", value=" + value +
                '}';
    }

    public void flipTheCoin(){
        System.out.println("flipingggggg");
    }
}
