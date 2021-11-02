import java.awt.*;

public class bill  extends money{
    //value
    public  int serialNumber;
    public Color color;


    public bill(int value, int serialNumber) {
        super(value);
        this.serialNumber = serialNumber;
        switch (value){
            case 20:
                this.color=Color.red;
                break;
            case 50:
                this.color=Color.green;
                break;
            case 100 :
                this.color= Color.yellow;
                break;
            case 200 :
                this.color=Color.BLUE;
        }
    }

    @Override
    public String toString() {
        return "bill{" +
                "serialNumber=" + serialNumber +
                ", color=" + color +
                ", value=" + value +
                '}';
    }
}
