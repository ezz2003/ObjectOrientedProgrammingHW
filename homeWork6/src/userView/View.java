package userView;
/*

 */
public class View implements IView{
    private IViewBase register;
    private IViewBase changePassw;
    private IViewBase logIn;

    public View(IViewBase register, IViewBase changePassw, IViewBase logIn) {
        this.register = register;
        this.changePassw = changePassw;
        this.logIn = logIn;
    }
}
