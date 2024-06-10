public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;

        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount <=100 && tonerAmount >=0){
            tonerLevel = tonerLevel + tonerAmount;
            return tonerLevel;
        }
        else{
            return -1;
        }
    }

    public int printPages(int pages){
        int jobPages = duplex? (pages/2) + (pages %2):pages;
        pagesPrinted +=jobPages;
        return jobPages;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
