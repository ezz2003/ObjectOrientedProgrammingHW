package userView;

public interface IViewRegister extends IViewBase{
    /**
     * запрашивает через View данные от пользователя
     * @return Array[] содержит все поля User
     */
    public default String[] registerForm() {
        String[] regData = new String[3];
        showRequest("Name");
        regData[0] = getUserStringForm();
        showRequest("Login");
        regData[1] = getUserStringForm();
        showRequest("Password");
        regData[2] = getUserStringForm();
        return regData;
    }
}
