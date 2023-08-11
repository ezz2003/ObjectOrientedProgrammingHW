package calcView;

import java.util.logging.Logger;

public class ViewRequests implements IViewBase, IViewRequests{
    Logger logger;

    public ViewRequests(Logger logger) {
        this.logger = logger;
    }
}
