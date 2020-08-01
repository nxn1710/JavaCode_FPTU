package lab5;

/**
 * @date Jul 6, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Edge {
    int source, dec, weight;

    public Edge() {
    }

    public Edge(int source, int dec, int weight) {
        this.source = source;
        this.dec = dec;
        this.weight = weight;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Edge{" + "source=" + source + ", dec=" + dec + ", weight=" + weight + '}';
    }

    public int getDec() {
        return dec;
    }

    public void setDec(int dec) {
        this.dec = dec;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}
