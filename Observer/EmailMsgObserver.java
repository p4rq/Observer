package Observer;

public class EmailMsgObserver implements Observer{
    private String name;
    public EmailMsgObserver(String name, Observable o){
        this.name = name;
        o.registerObserver(this);
    }
    @Override
    public void update(String news) {
        System.out.println(name + " found out: " + news);
    }
}
