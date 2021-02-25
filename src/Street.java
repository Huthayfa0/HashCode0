public class Street {


    private int start;
    private int end;
    private String name;
    private int time;


    public Street(int start, int end, String name, int time) {
        setStart(start);
        setEnd(end);
        setName(name);
        setTime(time);
    }



    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }





}
