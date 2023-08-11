package calcView;
/*
View - реализует связь с пользователем через терминал:
ViewRequests - все запросы от пользователя
ViewShow - все выводы в консоль
 */
public class View implements IView{
    ViewRequests viewRequests;
    ViewShows viewShows;

    public View(ViewRequests viewRequests, ViewShows viewShows) {
        this.viewRequests = viewRequests;
        this.viewShows = viewShows;
    }


}
