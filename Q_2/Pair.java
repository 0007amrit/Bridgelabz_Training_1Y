package Q_2;

class Pair<T, U> {
    private T first;
    private U second;


    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }


    public void display() {
        System.out.println("First (" + first.getClass().getSimpleName() + "): " + first);
        System.out.println("Second (" + second.getClass().getSimpleName() + "): " + second);
    }
}
