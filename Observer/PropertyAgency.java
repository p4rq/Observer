package Observer;

import java.util.ArrayList;
import java.util.List;

public class PropertyAgency implements Observable{
    private List<Observer> customers;
    private String newsAgency;
    public PropertyAgency(){
        customers = new ArrayList<>();
    }

    public void setNewsAgency(String news) {
        this.newsAgency = news;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        customers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        customers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : customers)
            o.update(newsAgency);
    }
}
